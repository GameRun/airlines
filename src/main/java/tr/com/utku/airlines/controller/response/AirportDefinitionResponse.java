package tr.com.utku.airlines.controller.response;

import lombok.Data;
import tr.com.utku.airlines.controller.dto.AirportDTO;
import tr.com.utku.airlines.controller.response.common.BaseResponse;
import tr.com.utku.airlines.model.Airport;

@Data
public class AirportDefinitionResponse extends BaseResponse {

    private AirportDTO airport;

    public AirportDefinitionResponse fromModel(Airport airportModel){

        this.airport = AirportDTO.builder()
                .id(airportModel.getId())
                .city(airportModel.getCity())
                .name(airportModel.getName())
                .code(airportModel.getCode())
                .build();
        return this;
    }
}
