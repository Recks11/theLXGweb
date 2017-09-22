package com.thelxg.data.Services.Impl;

import com.thelxg.data.Dao.FiestaPlayerDao;
import com.thelxg.data.Services.FiestaPlayerService;
import com.thelxg.data.models.FiestaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FiestaPlayerServiceImpl implements FiestaPlayerService {

    private final FiestaPlayerDao fiestaPlayerDao;

    @Autowired
    public FiestaPlayerServiceImpl(FiestaPlayerDao fiestaPlayerDao) {
        this.fiestaPlayerDao = fiestaPlayerDao;
    }

    @Transactional
    public void addPlayer(FiestaPlayer play) {
        fiestaPlayerDao.addPlayer(play);
    }

    @Transactional
    public void updatePlayer(FiestaPlayer play) {
        fiestaPlayerDao.updatePlayer(play);
    }

    @Transactional
    public FiestaPlayer getPlayerById(long id) {
        return fiestaPlayerDao.getPlayerById(id);
    }

    @Transactional
    public void removePlayer(long id) {
        fiestaPlayerDao.removePlayer(id);
    }

    @Transactional
    public List<FiestaPlayer> getAllFiestaPlayers() {
        return fiestaPlayerDao.getAllFiestaPlayers();
    }

    @Transactional
    public FiestaPlayer getPlayerByUniqueId(String uniqueId) {
        return fiestaPlayerDao.getPlayerByUniqueId(uniqueId);
    }

    @Transactional
    public FiestaPlayer getPlayerByAlias(String alias) {
        return fiestaPlayerDao.getPlayerByAlias(alias);
    }
}
