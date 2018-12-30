package propra2.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonController {

//	@GetMapping("**") // Match all GET Requests
//	public @ResponseBody String whatever() {
//		return "Hallo, ich bin das Person-SCS";
//	}
	@Autowired
	PersonRepository personRepository;
	@GetMapping("/")
	public String mainpage(Model model) {
		List<Person> persons = personRepository.findAll();
		model.addAttribute("persons",persons);
		return "index";
	}


}
