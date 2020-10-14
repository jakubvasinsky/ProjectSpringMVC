package sk.kosickaakademia.vasinsky.projectSpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping


public class HelloController {
@RequestMapping("/home")
    public String HomeTest(){
        return "home-page";
    }

}
