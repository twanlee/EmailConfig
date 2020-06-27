package controllers;

import model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import servcie.EmailService;

@Controller
public class EmailController {
    private EmailService emailService;
    @GetMapping("/index")
    public ModelAndView config(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("email", new Email());
        return modelAndView;
    }
    @PostMapping
    public ModelAndView process(@ModelAttribute("email") Email email){
        emailService.save(email);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message","DOne!");
        modelAndView.addObject("email",email);
        return modelAndView;
    }
}
