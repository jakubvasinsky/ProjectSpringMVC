package sk.kosickaakademia.vasinsky.projectSpringMVC;


import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);

    }

    @RequestMapping("/showForm")
    public String showForm(Model theModel){

        theModel.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult theBindingResult){
        System.out.println("Last Name: |"+theCustomer.getLastName()+"|");  //Vypise do konzoly priezvisko (kontrola, ci pole zoberie medzeru)

       /* System.out.println("Binding result: "+theBindingResult);*/       //Ukaze cestu ku kodom na prepis za ucelom vlastnej chybovej hlasky

        if (theBindingResult.hasErrors()){
            return "customer-form";
        }else {
            return "customer-confirmation";
        }

    }


}
