package com.thelxg.data.Dao.Impl;

import com.thelxg.data.Dao.groupsDao;
import com.thelxg.data.models.features.groups;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class groupsDaoImpl implements groupsDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public groupsDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void setGroupNumber(groups group) {
        sessionFactory.getCurrentSession().saveOrUpdate(group);
    }

    @Override
    public groups getGroupByNumber(int number) {
        return (groups) sessionFactory.getCurrentSession()
                .createQuery("from groups where groupNumber = :groupNumber")
                .setParameter("groupNumber", number)
                .uniqueResult();
    }

    @Override
    public groups getLastGroup() {
        return (groups) sessionFactory.getCurrentSession()
                .createQuery("from groups").uniqueResult();
    }
}
