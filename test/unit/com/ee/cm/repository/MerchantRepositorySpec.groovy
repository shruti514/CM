package com.ee.cm.repository

import com.ee.cm.model.Merchant
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.query.Query
import spock.lang.Specification

import static org.springframework.data.mongodb.core.query.Criteria.where

/**
 * User: Shruti Gangras
 * Date: 24/4/13
 * Time: 3:52 PM
 */
class MerchantRepositorySpec extends Specification{
    MerchantRepository merchantRepo
    def mongo;
    Merchant expected;
    Merchant merchant2;

    def setup() {
        merchantRepo = new MerchantRepository();
        mongo = Mock(MongoOperations);
        merchantRepo.mongoOperations = mongo;
        expected = [businessName:"expected", logo:"images/logo1.jpg"] as Merchant
    }

    def "it should return the merchant record from the db"() {
        setup:
            Query query = new Query().addCriteria(where("businessName").is(expected.businessName));
        when:
            Merchant actual = merchantRepo.getMerchant(expected.businessName);
        then:
            1 * mongo.findOne(query, Merchant.class) >> expected;
            actual == expected;
    }

}
