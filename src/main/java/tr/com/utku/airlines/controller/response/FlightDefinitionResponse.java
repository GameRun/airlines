package tr.com.utku.airlines.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tr.com.utku.airlines.controller.dto.FlightDTO;
import tr.com.utku.airlines.controller.response.common.BaseResponse;
import tr.com.utku.airlines.model.Flight;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class FlightDefinitionResponse extends BaseResponse {

    private FlightDTO flight;

    public static FlightDefinitionResponse fromModel(Flight model) {
        return FlightDefinitionResponse.builder()
                .flight(FlightDTO.fromModel(model)).build();
    }
}
