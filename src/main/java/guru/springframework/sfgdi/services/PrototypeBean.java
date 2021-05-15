package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Jan Hartman
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

	public PrototypeBean() {
		System.out.println("Creating a Prototype Bean JHA.");
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	public String getMyScope() {
		return "I'm a Prototype.";
	}
}
