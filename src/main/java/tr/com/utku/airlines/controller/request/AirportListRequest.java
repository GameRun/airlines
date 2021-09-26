package tr.com.utku.airlines.controller.request;

import lombok.Data;
import tr.com.utku.airlines.model.AirportCriteria;

@Data
public class AirportListRequest {

    private String id;
    private String code;
    private String name;
    private String city;

    public AirportCriteria toModel() {
        return AirportCriteria.builder()
                .id(id)
                .city(city)
                .name(name)
                .code(code)
                .build();
    }
}
