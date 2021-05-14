package guru.springframework.sfgdi.repositories;

/**
 * @author Jan Hartman
 */
//@Repository
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

	@Override
	public String getGreeting() {
		return "Hello World - EN";
	}
}
