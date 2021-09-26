package tr.com.utku.airlines.controller.response;

import lombok.Data;
import tr.com.utku.airlines.controller.dto.AirportDTO;
import tr.com.utku.airlines.controller.response.common.BaseResponse;
import tr.com.utku.airlines.model.Airport;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class AirportListResponse extends BaseResponse {

    private List<AirportDTO> airportList;

    public AirportListResponse fromModel(List<Airport> list) {
        this.airportList = list.stream().map(airport -> creteaDTO(airport)).collect(Collectors.toList());
        return this;
    }

    public AirportDTO creteaDTO(Airport airport) {
        return AirportDTO.builder()
                .code(airport.getCode())
                .id(airport.getId())
                .name(airport.getName())
                .city(airport.getCity())
                .build();
    }
}
