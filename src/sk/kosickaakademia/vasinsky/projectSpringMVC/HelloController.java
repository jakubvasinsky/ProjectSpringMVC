package sk.kosickaakademia.vasinsky.projectSpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/hello")


public class HelloController {
@RequestMapping("/home")
    public String HomeTest(){
        return "home-page";
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
