package com.ee.cm.repository

import com.ee.cm.model.Merchant
import org.springframework.data.mongodb.core.query.Query

import static org.springframework.data.mongodb.core.query.Criteria.where

/**
 * User: Shruti Gangras
 * Date: 24/4/13
 * Time: 3:51 PM
 */
class MerchantRepository {
 def  mongoOperations

    def getMerchant(String businessName) {
        Query query = new Query().addCriteria(where("businessName").is(businessName));
        mongoOperations.findOne(query, Merchant.class);
    }


}
