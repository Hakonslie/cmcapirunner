package cmcapipro;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MapDataJSON {
	@SerializedName("data")
	@Expose
	private List<mapIdJSON> data = null;

	public List<mapIdJSON> getData() {
	return data;
	}
	public int getId() {
		return data.get(0).getId();
	}

	public String getName() {
		return data.get(0).getName();
	}


	public void setData(List<mapIdJSON> data) {
	this.data = data;
	}
}
