package tr.com.utku.airlines.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Airport {

    private String id;
    private String name;
    private String code;
    private String city;

}
