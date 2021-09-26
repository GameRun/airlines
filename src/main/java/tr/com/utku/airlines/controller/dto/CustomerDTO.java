package tr.com.utku.airlines.controller.dto;

import lombok.Builder;
import lombok.Data;
import tr.com.utku.airlines.model.Customer;

@Builder
@Data
public class CustomerDTO {

    private String id;
    private String accountNo;
    private String name;
    private String surname;
    private String gender;

    public static CustomerDTO fromModel(Customer model) {
        return CustomerDTO.builder()
                .accountNo(model.getAccountNo())
                .id(model.getId())
                .gender(model.getGender())
                .surname(model.getSurname())
                .name(model.getName())
                .build();
    }

    public Customer toModel() {
        return Customer.builder()
                .accountNo(accountNo)
                .gender(gender)
                .name(name)
                .surname(surname)
                .build();
    }
}
