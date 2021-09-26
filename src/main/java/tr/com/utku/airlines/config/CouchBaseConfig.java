package tr.com.utku.airlines.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class CouchBaseConfig extends AbstractCouchbaseConfiguration {

    @Override
    public String getConnectionString() {
        return "127.0.0.1";
    }

    @Override
    public String getUserName() {
        return "admin";
    }

    @Override
    public String getPassword() {
        return "123456";
    }

    @Override
    public String getBucketName() {
        return "first_bucket";
    }
}
