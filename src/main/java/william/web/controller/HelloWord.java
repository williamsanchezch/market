package william.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Ruta General
@RequestMapping("/saludar")
public class HelloWord {
   @GetMapping("/hola")
    public String saludar(){
       return "Hi... from spring-boot \uD83E\uDDD1\u200D\uD83D\uDCBB";
   }
}
