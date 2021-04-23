package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Jan Hartman
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hallo wereld - Property.";
	}
}
