package guru.springframework.sfgdi.datasource;

/**
 * @author Jan Hartman
 */
public class FakeDataSource {

	private String jdbcurl;

	private String password;

	private String username;

	public String getJdbcurl() {
		return jdbcurl;
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
