package com.thelxg.controllers;

import com.thelxg.data.Services.vendorService;
import com.thelxg.data.models.vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rex on 27/05/2017.
 */

@Controller
@RequestMapping("/vendor")
public class vendorController {


    private final vendorService vendorServic;
    private final vendor vendorBean;

    @Autowired
    public vendorController(vendor vendorBean, vendorService vendorServic) {
        this.vendorBean = vendorBean;
        this.vendorServic = vendorServic;
    }


    @RequestMapping("/")
    public String register(Model model){

        model.addAttribute("title","Vendor - TheLXG");
        model.addAttribute("vendorObject", vendorBean);
        return "vendorDetails";
    }

    @ModelAttribute("locationList")
    public List<String> getWebFrameworkList() {
        List<String> locationList = new ArrayList<String>();
        locationList.add("Lagos Island");
        locationList.add("Lagos Mainland");

        return locationList;
    }

    @PostMapping("/")
    public String addVendor(@ModelAttribute("vendorObject") vendor vend, HttpServletRequest request){

        vendorServic.addVendor(vend);
        return "redirect:/";

    }
}
