package xorstack;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@ConfigurationProperties("XORSTACK")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DEMOProperties {

	private String headerApiKey;
	private String imagePath;
	private int apiSessionTime;

	public String getHeaderApiKey() {
		return headerApiKey;
	}

	public void setHeaderApiKey(String headerApiKey) {
		this.headerApiKey = headerApiKey;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public int getApiSessionTime() {
		return apiSessionTime;
	}

	public void setApiSessionTime(int apiSessionTime) {
		this.apiSessionTime = apiSessionTime;
	}

}
