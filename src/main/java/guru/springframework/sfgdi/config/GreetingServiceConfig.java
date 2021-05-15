package guru.springframework.sfgdi.config;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.I18nEnglishGreetingService;
import guru.springframework.sfgdi.services.I18nSpanishGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

/**
 * @author Jan Hartman
 */
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

	@Profile({"cat"})
	@Bean
	PetService catPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory().getPetService("cat");
	}

	//	@Bean
	ConstructorGreetingService constructorGreetingService() {
		return new ConstructorGreetingService();
	}

	@Profile({"dog", "default"})
	@Bean("petService")
	PetService dogPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory().getPetService("dog");
	}

	@Bean
	EnglishGreetingRepository englishGreetingRepository() {
		return new EnglishGreetingRepositoryImpl();
	}

	@Profile({"ES", "default"})
	@Bean
	I18nSpanishGreetingService greetingService() {
		return new I18nSpanishGreetingService();
	}

	@Profile({"ES", "default"})
	@Bean
	I18nEnglishGreetingService i18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
		return new I18nEnglishGreetingService(englishGreetingRepository);
	}

	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}

	@Bean
	PropertyInjectedGreetingService propertyInjectedGreetingService() {
		return new PropertyInjectedGreetingService();
	}

	@Bean
	SetterInjectedGreetingService setterInjectedGreetingService() {
		return new SetterInjectedGreetingService();
	}
}
