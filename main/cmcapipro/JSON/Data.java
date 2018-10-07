package cmcapipro.JSON;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

@SerializedName("BTC")
@Expose
private BTC bTC;

public BTC getBTC() {
return bTC;
}

public void setBTC(BTC bTC) {
this.bTC = bTC;
}

}