package co.edu.uceva.pais_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pais-service")
public class PaisRestController {

    @GetMapping("/hola")
    public String holaMundo(@PathVariable("nombre") String nombre){
        return "Hola mundo!";
    }
}
