package space.chensheng.wechatty.mp.material;

import com.fasterxml.jackson.annotation.JsonProperty;

import space.chensheng.wechatty.common.http.BaseResponse;

public class VideoFindResponse extends BaseResponse {
	private static final long serialVersionUID = 8904809925279606199L;

	@JsonProperty
	private String title;
	
	@JsonProperty
	private String description;
	
	@JsonProperty("down_url")
	private String downUrl;

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getDownUrl() {
		return downUrl;
	}
	
}
