package tr.com.utku.airlines.repository.impl;

import org.springframework.stereotype.Service;
import tr.com.utku.airlines.model.Customer;
import tr.com.utku.airlines.services.data.CustomerData;

@Service
public class CustomerDataImpl implements CustomerData {
    @Override
    public Customer createCustomer(Customer model) {
        //
        return null;
    }

    @Override
    public Customer getCustomerByAccountNo(String accountNo) {
        return null;
    }
}
