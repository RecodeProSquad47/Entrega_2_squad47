package vidaalemdasgrades.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import vidaalemdasgrades.repository.EmpresasRepository;


public class EmpresasController {
	@Autowired
	private EmpresasRepository empresaRepository;
	
	@GetMapping
	public ModelAndView empresa() {
		ModelAndView modelAndView = new ModelAndView("views/empresa/index.html");
		modelAndView.addObject("empresas", empresaRepository.findAll());
		return modelAndView;
}
}
