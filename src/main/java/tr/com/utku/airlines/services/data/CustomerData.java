package tr.com.utku.airlines.services.data;

import tr.com.utku.airlines.model.Customer;

public interface CustomerData {

    Customer createCustomer(Customer model);

    Customer getCustomerByAccountNo(String accountNo);

}
