package cmcapipro.JSON;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BTC {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("name")
@Expose
private String name;
@SerializedName("symbol")
@Expose
private String symbol;
@SerializedName("slug")
@Expose
private String slug;
@SerializedName("circulating_supply")
@Expose
private Integer circulatingSupply;
@SerializedName("total_supply")
@Expose
private Integer totalSupply;
@SerializedName("max_supply")
@Expose
private Integer maxSupply;
@SerializedName("date_added")
@Expose
private String dateAdded;
@SerializedName("num_market_pairs")
@Expose
private Integer numMarketPairs;
@SerializedName("cmc_rank")
@Expose
private Integer cmcRank;
@SerializedName("last_updated")
@Expose
private String lastUpdated;
@SerializedName("quote")
@Expose
private Quote quote;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
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

public String getSlug() {
return slug;
}

public void setSlug(String slug) {
this.slug = slug;
}

public Integer getCirculatingSupply() {
return circulatingSupply;
}

public void setCirculatingSupply(Integer circulatingSupply) {
this.circulatingSupply = circulatingSupply;
}

public Integer getTotalSupply() {
return totalSupply;
}

public void setTotalSupply(Integer totalSupply) {
this.totalSupply = totalSupply;
}

public Integer getMaxSupply() {
return maxSupply;
}

public void setMaxSupply(Integer maxSupply) {
this.maxSupply = maxSupply;
}

public String getDateAdded() {
return dateAdded;
}

public void setDateAdded(String dateAdded) {
this.dateAdded = dateAdded;
}

public Integer getNumMarketPairs() {
return numMarketPairs;
}

public void setNumMarketPairs(Integer numMarketPairs) {
this.numMarketPairs = numMarketPairs;
}

public Integer getCmcRank() {
return cmcRank;
}

public void setCmcRank(Integer cmcRank) {
this.cmcRank = cmcRank;
}

public String getLastUpdated() {
return lastUpdated;
}

public void setLastUpdated(String lastUpdated) {
this.lastUpdated = lastUpdated;
}

public Quote getQuote() {
return quote;
}

public void setQuote(Quote quote) {
this.quote = quote;
}

}