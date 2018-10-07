package cmcapipro;

public class Currency {

	private String name, symbol;
	private int cmcId;
	private double price;
	
	public Currency(String name, String symbol, int cmcId) {
		this.cmcId = cmcId;
		this.price = 0.0;
		this.name = name;
		this.symbol = symbol;		
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getCmcId() {
		return cmcId;
	}

	public void setCmcId(int cmcId) {
		this.cmcId = cmcId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
