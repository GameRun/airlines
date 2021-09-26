package tr.com.utku.airlines.repository.jpa;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tr.com.utku.airlines.model.AirportCriteria;

import java.util.List;

@Repository
public interface AirportRepository extends CrudRepository<AirportEntity, String> {

    List<AirportEntity> findByCode(String code);

    @Query("#{#n1ql.selectEntity} where #{#n1ql.filter} AND" +
            " ( $1 is null or $1 = '' or  code = $1 ) and city = $2")
    List<AirportEntity> findAirportTest(String code, String city);

}
