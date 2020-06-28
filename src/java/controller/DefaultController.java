package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author Roberto Garrido Trillo
 */
@Controller
public class DefaultController {

   @RequestMapping (value = "/")
   public String index ()
   {
      System.out.println("index");
      return "index";
   }
}
