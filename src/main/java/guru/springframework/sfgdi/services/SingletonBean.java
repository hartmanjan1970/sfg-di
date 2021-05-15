package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * @author Jan Hartman
 */
@Component
public class SingletonBean {

	public SingletonBean() {
		System.out.println("Create a Singleton Bean JHA.");
	}

	public String getMyScope() {
		return "I'am a singleton.";
	}
}
