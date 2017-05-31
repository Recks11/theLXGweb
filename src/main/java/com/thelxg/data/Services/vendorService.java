package com.thelxg.data.Services;

import com.thelxg.data.models.vendor;

/**
 * Created by rex on 29/05/2017.
 */
public interface vendorService {

    void addVendor(vendor vend);

    vendor getVendorById(long id);

    void deleteVendor(long id);
}
