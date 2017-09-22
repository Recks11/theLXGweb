package com.thelxg.controllers.lxgFiesta;

import com.thelxg.data.Services.FeedbackService;
import com.thelxg.data.models.FiestaPlayer;
import com.thelxg.data.models.features.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/fiesta/")
public class fiestaIndexController {

    private final FeedbackService feedbackService;

    @Autowired
    public fiestaIndexController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @RequestMapping("/home")
    public String home(Model model){

        model.addAttribute("title","LXG'17 - FIESTA");
        model.addAttribute("home","active");
        model.addAttribute("feedbackObject", new Feedback());
        return "lxg_fiesta_pages/FiestaHome";
    }
    @RequestMapping("/register")
    public String registerPage(Model model){
        model.addAttribute("title","LXG'17 FIESTA - REGISTER");
        model.addAttribute("register","active");
        model.addAttribute("FiestaPlayerObject", new FiestaPlayer());
        return "lxg_fiesta_pages/FiestaRegister";
    }

    @PostMapping("/sendFeedback")
    public String sendFeedback(Model model, @ModelAttribute("feedbackObject") Feedback feedback){

        feedback.setDate(new Date());
        feedbackService.saveFeedback(feedback);
        return "redirect:/fiesta/home";
    }
}
