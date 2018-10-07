package cmcapipro.JSON;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Quote {

@SerializedName("NOK")
@Expose
private NOK nOK;

public NOK getNOK() {
return nOK;
}

public void setNOK(NOK nOK) {
this.nOK = nOK;
}

}