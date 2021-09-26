package tr.com.utku.airlines.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AirportCriteria {

    private String id;
    private String code;
    private String name;
    private String city;
}
