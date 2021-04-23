package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Jan Hartman
 */
class SetterInjectedControllerTest {

	SetterInjectedController controller;

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();

		controller.setGreetingService(new ConstructorGreetingService());
	}
}
