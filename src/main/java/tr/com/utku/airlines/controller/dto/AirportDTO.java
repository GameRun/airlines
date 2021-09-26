package tr.com.utku.airlines.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AirportDTO {

    private String id;
    private String code;
    private String name;
    private String city;
}
