package sk.kosickaakademia.vasinsky.projectSpringMVC;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class ControllerTwo {
   @RequestMapping("/showForm")
    public String displayTheForm(){
   return "silly";

    }

}
