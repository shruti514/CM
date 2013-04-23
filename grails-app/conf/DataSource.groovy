// environment specific settings
environments {
    development {
        grails {
            mongo {
                host = "localhost"
                port = 27017
                databaseName = "ltp"
            }
        }
    }
    test {
        grails {
            mongo {
                host = "localhost"
                port = 27017
                databaseName = "test-ltp"
            }
        }
    }
    production {
        grails {
            mongo {
                host = "localhost"
                port = 27017
                databaseName = "ltp"
            }
        }
    }
}
