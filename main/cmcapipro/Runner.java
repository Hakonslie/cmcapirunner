package cmcapipro;

import java.util.regex.Pattern;
import java.io.IOException;
import java.sql.SQLException;
import java.util.UUID;
import javax.sql.DataSource;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.ResponseBody;

import cmcapipro.JSON.PriceCheck;

public class Runner {
	
	
	public static void main(String [] args) {
		
        if (args.length == 0) {
            System.out.println("Run the class with an argument, on of `insert`, or ...");
            System.exit(1);
        }
        
        String [] currenciesToUpdate = new String [args.length];
        Pattern pat = Pattern.compile("(^\\w{3,5}$)");
        int i = 0;
        for(String arg : args) 
        {
        	
        	if(pat.matcher(arg).matches()) 
        	{
        		currenciesToUpdate[i] = arg.toUpperCase();
        		i++;
        	}
        	
        	else { System.out.println(arg + " didnt match"); }
		
        }
        
        try {
			generateCurrencyObject(currenciesToUpdate);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static Currency [] generateCurrencyObject(String [] currencyStrings) throws IOException {
		
		OkHttpClient client = new OkHttpClient();

		Request request;
		Gson gson = new Gson();
		PriceCheck pc;
		String name;

		for(String currencyString : currencyStrings) {
			
			// get ID, Price and name
			request = new Request.Builder()
					.url("https://sandbox-api.coinmarketcap.com/v1/cryptocurrency/quotes/latest?symbol=" + currencyString + "&convert=NOK")
					 .get()
					 .addHeader("Accept", "application/json")
					 .addHeader("X-CMC_PRO_API_KEY", "03bdf165-8035-4ace-8ed1-17a9c18dac06")
					 .addHeader("cache-control", "no-cache")
					 .build();
			try(ResponseBody rb = client.newCall(request).execute().body()) {
				
				pc = gson.fromJson(rb.string(),PriceCheck.class);
				
				System.out.println(pc.getData().getBTC().getQuote().getNOK().getPrice());
			}
			
			
			
			
			
		}
		
		return null;
	}
}
