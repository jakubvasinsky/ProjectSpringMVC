package sk.kosickaakademia.vasinsky.projectSpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/hello")


public class HelloController {
@RequestMapping("/surprise")
    public String surprise(){
        return "surprise";
    }

    @RequestMapping("/showForm")
    public String showForm(){
    return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

@RequestMapping("/processFormVersionTwo")
    public String ConvertToAllCaps(HttpServletRequest request, Model model){

    String theName = request.getParameter("studentName");
    theName = theName.toUpperCase();
    String result = "Ahoj "+ theName +"!";
    model.addAttribute("message", result );

return "helloworld" ;

}

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){


        theName = theName.toUpperCase();
        String result = "Hello "+ theName +"!";
        model.addAttribute("message", result );

        return "helloworld" ;

    }

}
    /** prazdny konstruktor gettery a settery firstname a email novy formular 
     * nova trieda student odosle sa to do View a view ukaze vysledky
     */
