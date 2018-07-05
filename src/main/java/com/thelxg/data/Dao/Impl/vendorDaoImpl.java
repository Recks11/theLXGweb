package com.thelxg.data.Dao.Impl;

import com.thelxg.data.Dao.vendorDao;
import com.thelxg.data.models.vendor;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by rex on 29/05/2017.
 */
@Repository
public class vendorDaoImpl implements vendorDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public vendorDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void addVendor(vendor vend) {
        sessionFactory.getCurrentSession().save(vend);
    }

    @Override
    public vendor getVendorById(long id) {
        return sessionFactory.getCurrentSession().get(vendor.class, id);
    }

    @Override
    public void deleteVendor(long id) {
        sessionFactory.getCurrentSession().delete(getVendorById(id));
    }
}
