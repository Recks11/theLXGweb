package com.thelxg.data.Dao;

import com.thelxg.data.models.vendor;

/**
 * Created by rex on 29/05/2017.
 */
public interface vendorDao {

    void addVendor(vendor vend);

    vendor getVendorById(long id);

    void deleteVendor(long id);
}
