package com.thelxg.data.Services.Impl;

import com.thelxg.data.Dao.vendorDao;
import com.thelxg.data.Services.vendorService;
import com.thelxg.data.models.vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by rex on 29/05/2017.
 */
@Service
public class vendorServiceImpl implements vendorService {


    private final vendorDao vendor;

    @Autowired
    public vendorServiceImpl(vendorDao vendor) {
        this.vendor = vendor;
    }

    @Transactional
    public void addVendor(vendor vend) {
        vendor.addVendor(vend);
    }

    @Transactional
    public vendor getVendorById(long id) {
        return vendor.getVendorById(id);
    }

    @Transactional
    public void deleteVendor(long id) {
        vendor.deleteVendor(id);
    }
}
