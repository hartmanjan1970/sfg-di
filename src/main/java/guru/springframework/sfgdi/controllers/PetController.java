package guru.springframework.sfgdi.controllers;

import com.springframework.pets.PetService;
import org.springframework.stereotype.Controller;

/**
 * @author Jan Hartman
 */
@Controller
public class PetController {

	private final PetService petService;

	public PetController(PetService petService) {
		this.petService = petService;
	}

	public String whichPetIsTheBest() {
		return petService.getPetType();
	}
}
