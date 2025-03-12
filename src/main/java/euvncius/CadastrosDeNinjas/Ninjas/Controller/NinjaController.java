package euvncius.CadastrosDeNinjas.Ninjas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //mesmo do rest API
@RequestMapping //precisa sempre, para fazer o mapeamento do site
public class NinjaController {

    @GetMapping("/boasvindas") //boas praticas colocar um barra antes
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }
}
