package vidaalemdasgrades.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuemsomosController {

    @GetMapping("/quemsomos")
    public String quemsomos() {
        return "quemsomos";
    }
}