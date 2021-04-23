package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Jan Hartman
 */
class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

	@BeforeEach
	void setUp() {

		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}
}
