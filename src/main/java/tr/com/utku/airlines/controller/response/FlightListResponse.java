package tr.com.utku.airlines.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tr.com.utku.airlines.controller.dto.FlightDTO;
import tr.com.utku.airlines.model.Flight;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class FlightListResponse {

    private List<FlightDTO> flightList;

    public static FlightListResponse fromModel(List<Flight> flightList) {
        return FlightListResponse.builder().flightList(fromFlightModelList(flightList)).build();
    }

    private static List<FlightDTO> fromFlightModelList(List<Flight> flightList) {
        return flightList.stream().map(flightModel -> FlightDTO.fromModel(flightModel)).collect(Collectors.toList());
    }

}
