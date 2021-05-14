package guru.springframework.sfgdi.services;

/**
 * @author Jan Hartman
 */
//@Service
public class PropertyInjectedGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hallo wereld - Property.";
	}
}
