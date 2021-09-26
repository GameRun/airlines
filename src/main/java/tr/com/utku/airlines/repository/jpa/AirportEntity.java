package tr.com.utku.airlines.repository.jpa;

import lombok.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;
import tr.com.utku.airlines.model.Airport;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Document
public class AirportEntity {

    @Id
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    private String id;

    @Field
    private String code;

    @Field
    private String name;

    @Field
    private String city;

    public static AirportEntity fromModel(Airport airport) {
        return AirportEntity.builder()
                .code(airport.getCode())
                .city(airport.getCity())
                .name(airport.getName())
                .build();
    }

    public Airport toModel() {
        return Airport.builder()
                .id(id)
                .code(code)
                .city(city)
                .name(name)
                .build();
    }


}
