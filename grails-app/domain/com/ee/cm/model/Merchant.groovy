package com.ee.cm.model

import org.bson.types.ObjectId

class Merchant {
    ObjectId id;
    String businessName;
    String merchantCode;
    String category;
    String logo;
    String address;

    @Override
    public String toString() {
        return "businessName: " + businessName + ", logo: " + logo;
    }

    static constraints = {
    }
}
