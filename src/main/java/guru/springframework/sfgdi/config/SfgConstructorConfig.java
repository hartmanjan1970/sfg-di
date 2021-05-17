package guru.springframework.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * @author Jan Hartman
 */
@ConstructorBinding
@ConfigurationProperties("guru")
public class SfgConstructorConfig {

	private final String jdbcurl;

	private final String password;

	private final String username;

	public SfgConstructorConfig(String jdbcurl, String password, String username) {
		this.jdbcurl = jdbcurl;
		this.password = password;
		this.username = username;
	}

	public String getJdbcurl() {
		return jdbcurl;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}
}
