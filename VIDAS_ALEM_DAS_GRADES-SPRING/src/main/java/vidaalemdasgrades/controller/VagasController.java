package vidaalemdasgrades.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import vidaalemdasgrades.repository.VagasRepository;



public class VagasController {
	@Autowired
	private VagasRepository vagaRepository;
	
	@GetMapping
	public ModelAndView vaga() {
		ModelAndView modelAndView = new ModelAndView("views/vaga/index.html");
		modelAndView.addObject("vagas", vagaRepository.findAll());
		return modelAndView;
}
}
