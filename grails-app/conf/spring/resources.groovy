import com.ee.cm.repository.MerchantRepository
import com.mongodb.Mongo
import org.springframework.data.mongodb.core.MongoTemplate

// Place your Spring DSL code here
beans = {

    ltpMongo(Mongo,  '${grails.mongo.host}', '${grails.mongo.port}'){}

    mongoOperations(MongoTemplate, ref(ltpMongo), '${grails.mongo.databaseName}'){}

    merchantRepository(MerchantRepository) {
        mongoOperations=ref(mongoOperations)
    }

}
