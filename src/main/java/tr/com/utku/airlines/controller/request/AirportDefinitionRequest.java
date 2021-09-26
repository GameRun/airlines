package tr.com.utku.airlines.controller.request;

import lombok.Data;
import tr.com.utku.airlines.model.Airport;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class AirportDefinitionRequest {

    @NotNull(message = "Airport code cannot null")
    @NotEmpty(message = "Airport code cannot empty")
    private String code;

    @NotNull(message = "Airport name cannot null")
    @NotEmpty(message = "Airport name cannot empty")
    private String name;

    @NotNull(message = "Airport city cannot null")
    @NotEmpty(message = "Airport city cannot empty")
    private String city;

    public Airport toModel() {
        return Airport.builder()
                .code(code)
                .city(city)
                .name(name).build();
    }

}
