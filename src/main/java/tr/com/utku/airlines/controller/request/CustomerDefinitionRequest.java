package tr.com.utku.airlines.controller.request;


import lombok.Data;
import tr.com.utku.airlines.model.Customer;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class CustomerDefinitionRequest {

    @NotNull(message = "Customer name cannot null")
    @NotEmpty(message = "Customer name cannot empty")
    private String name;

    @NotNull(message = "Customer accountNo cannot null")
    @NotEmpty(message = "Customer accountNo cannot empty")
    private String accountNo;

    @NotNull(message = "Customer surname cannot null")
    @NotEmpty(message = "Customer surname cannot empty")
    private String surname;

    @NotNull(message = "Customer gender cannot null")
    @NotEmpty(message = "Customer gender cannot empty")
    private String gender;


    public Customer toModel() {
        return Customer.builder()
                .gender(this.getGender())
                .name(this.getName())
                .surname(this.getSurname())
                .accountNo(this.getAccountNo())
                .build();
    }

}
