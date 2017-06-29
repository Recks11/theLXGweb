package com.thelxg.data.Services.Impl;

import com.thelxg.data.Dao.pinDao;
import com.thelxg.data.Services.pinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by rex on 29/06/2017.
 */
@Service
public class PinServiceImpl implements pinService {

    private final pinDao pindao;

    @Autowired
    public PinServiceImpl(pinDao pindao) {
        this.pindao = pindao;
    }

    @Transactional
    public String getPin() {
        return pindao.getPin();
    }

    @Transactional
    public String getPinUser() {
        return pindao.getPinUser();
    }
}
