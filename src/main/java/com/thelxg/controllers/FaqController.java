package com.thelxg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rex on 30/05/2017.
 */
@Controller
@RequestMapping("/faq")
public class FaqController {

    @SuppressWarnings("SameReturnValue")
    @RequestMapping
    public String showFaq(Model model) {

        model.addAttribute("LXG - Faq", "title");
        return "faq";

    }

}
