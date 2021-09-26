package tr.com.utku.airlines.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Customer {

    private String id;
    private String name;
    private String surname;
    private String gender;
    private String accountNo;
}
