package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Roberto Garrido Trillo
 */
@Controller
public class HomeController {

   @RequestMapping (value = "/home", method = RequestMethod.GET)
   public String home (Model model)
   {
      model.addAttribute("saludo", "HOLAAAA");
      return "home";
   }
}
