package com.thelxg.components;

import com.thelxg.data.models.FiestaPlayer;
import com.thelxg.data.models.player;
import org.springframework.web.bind.annotation.RequestBody;

public interface savePlayerAndSendMail {

    void savePlayer(@RequestBody player play);

    boolean saveFiestaPlayer(@RequestBody FiestaPlayer fiestaPlayer);
}
