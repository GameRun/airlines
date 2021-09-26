package tr.com.utku.airlines.services;

import tr.com.utku.airlines.model.Customer;

public interface CustomerServices {
    Customer createCustomer(Customer customer);

    Customer getCustomerByAccountNo(String accountNo);
}
