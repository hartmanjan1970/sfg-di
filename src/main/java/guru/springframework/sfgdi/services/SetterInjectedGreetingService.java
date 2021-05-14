package guru.springframework.sfgdi.services;

/**
 * @author Jan Hartman
 */
//@Service
public class SetterInjectedGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hallo wereld - Setter.";
	}
}
