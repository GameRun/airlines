package tr.com.utku.airlines.controller.response;

import lombok.Builder;
import lombok.Data;
import tr.com.utku.airlines.controller.dto.CustomerDTO;
import tr.com.utku.airlines.controller.response.common.BaseResponse;
import tr.com.utku.airlines.model.Customer;


@Data
@Builder
public class CustomerDefinitionResponse extends BaseResponse {

    private CustomerDTO customer;

    public static CustomerDefinitionResponse fromModel(Customer model) {
        return CustomerDefinitionResponse.builder()
                .customer(CustomerDTO.fromModel(model))
                .build();

    }

}
