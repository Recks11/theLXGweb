package com.thelxg.controllers.lxgFiesta;

import com.thelxg.components.savePlayerAndSendMail;
import com.thelxg.data.models.FiestaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fiesta/rest")
public class fiestaRegisterController {
    private final savePlayerAndSendMail saveAndSend;

    @Autowired
    public fiestaRegisterController(savePlayerAndSendMail saveAndSend) {
        this.saveAndSend = saveAndSend;
    }

    @PostMapping("/register")
    public String phyRegisterPlayer(@RequestBody FiestaPlayer fiestaPlayer) {

        saveAndSend.saveFiestaPlayer(fiestaPlayer);
        return "index";
    }
}
