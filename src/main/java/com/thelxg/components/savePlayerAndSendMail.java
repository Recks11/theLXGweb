package com.thelxg.components;

import com.thelxg.data.models.FiestaPlayer;
import com.thelxg.data.models.Player;
import org.springframework.web.bind.annotation.RequestBody;

public interface savePlayerAndSendMail {

    void savePlayer(@RequestBody Player play);

    boolean saveFiestaPlayer(@RequestBody FiestaPlayer fiestaPlayer);
}
