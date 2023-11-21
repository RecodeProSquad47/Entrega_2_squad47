package vidaalemdasgrades.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import vidaalemdasgrades.repository.CursosRepository;


public class CursosController {
	@Autowired
	private CursosRepository cursoRepository;
	
	@GetMapping
	public ModelAndView curso() {
		ModelAndView modelAndView = new ModelAndView("views/curso/index.html");
		modelAndView.addObject("cursos", cursoRepository.findAll());
		return modelAndView;
	}
}
