package cmcapipro;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class mapIdJSON {

	@SerializedName("id")
	@Expose
	private Integer id;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("is_active")
	@Expose
	private Integer isActive;

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

	public Integer getIsActive() {
	return isActive;
	}

	public void setIsActive(Integer isActive) {
	this.isActive = isActive;
	}
}