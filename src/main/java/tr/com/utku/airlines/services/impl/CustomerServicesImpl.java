package tr.com.utku.airlines.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.utku.airlines.model.Customer;
import tr.com.utku.airlines.services.data.CustomerData;
import tr.com.utku.airlines.services.CustomerServices;
import tr.com.utku.airlines.services.exception.AirlinesBusinessException;

@Service
@RequiredArgsConstructor
public class CustomerServicesImpl implements CustomerServices {

    private final CustomerData customerData;

    @Override
    public Customer createCustomer(Customer customer) {
        Customer existCustomer = customerData.getCustomerByAccountNo(customer.getAccountNo());
        if (existCustomer == null) {
            return customerData.createCustomer(customer);
        } else {
            throw new AirlinesBusinessException("A10002");
        }
    }

    @Override
    public Customer getCustomerByAccountNo(String accountNo) {
        return customerData.getCustomerByAccountNo(accountNo);
    }

}
