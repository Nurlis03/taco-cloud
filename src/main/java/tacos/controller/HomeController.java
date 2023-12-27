package tacos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
Поскольку HomeController снабжен аннотацией
@Controller, механизм сканирования в Spring автоматически обна-
ружит его и создаст экземпляр HomeController как bean-компонент
в контексте приложения Spring. 
*/
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
