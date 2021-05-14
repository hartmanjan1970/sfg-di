package guru.springframework.sfgdi.services;

/**
 * @author Jan Hartman
 */
//@Service
public class ConstructorGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hallo wereld - Constructor.";
	}
}
