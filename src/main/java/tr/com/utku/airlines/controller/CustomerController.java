package tr.com.utku.airlines.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tr.com.utku.airlines.controller.request.CustomerDefinitionRequest;
import tr.com.utku.airlines.controller.response.CustomerDefinitionResponse;
import tr.com.utku.airlines.model.Customer;
import tr.com.utku.airlines.services.CustomerServices;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "customer")
public class CustomerController {

    private final CustomerServices customerServices;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping(value = "create-customer")
    public CustomerDefinitionResponse createCustomer(@RequestBody @Valid CustomerDefinitionRequest request) {
        Customer model = customerServices.createCustomer(request.toModel());
        return CustomerDefinitionResponse.fromModel(model);
    }
    
    @ResponseStatus(HttpStatus.OK)
    @PostMapping(value = "list-customer")
    public CustomerDefinitionResponse getCustomerByAccountNo(@RequestBody String accountNo) {
        Customer model = customerServices.getCustomerByAccountNo(accountNo);
        return CustomerDefinitionResponse.fromModel(model);
    }
}
