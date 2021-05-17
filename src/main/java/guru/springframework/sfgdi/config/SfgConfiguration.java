package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jan Hartman
 */
@ConfigurationProperties("guru")
@Configuration
public class SfgConfiguration {

	private String jdbcurl;

	private String password;

	private String username;

	public String getJdbcurl() {
		return jdbcurl;
	}

	public void setJdbcurl(String jdbcurl) {
		this.jdbcurl = jdbcurl;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setJdbcUrl(String jdbcurl) {
		this.jdbcurl = jdbcurl;
	}
}
