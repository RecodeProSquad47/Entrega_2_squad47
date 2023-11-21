package vidaalemdasgrades.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import vidaalemdasgrades.repository.ProjetosRepository;

@Controller
@RequestMapping("/projetos")
public class ProjetosController {
	@Autowired
	private ProjetosRepository projetoRepository;
	
	@GetMapping
	public ModelAndView projeto() {
		ModelAndView modelAndView = new ModelAndView("views/projetos/projetos.html");
		modelAndView.addObject("projetos", projetoRepository.findAll());
		return modelAndView;
	}
}

