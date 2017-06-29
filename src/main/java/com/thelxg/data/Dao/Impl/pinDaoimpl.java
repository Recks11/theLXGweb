package com.thelxg.data.Dao.Impl;

import com.thelxg.data.Dao.pinDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by rex on 29/06/2017.
 */
@Repository
public class pinDaoimpl implements pinDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public pinDaoimpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public String getPin() {
        return (String) sessionFactory.getCurrentSession().createQuery("select number from pin").uniqueResult();
    }

    @Override
    public String getPinUser() {
        return null;
    }
}
