package org.example.app.service.customer;


import org.example.app.dto.customer.CustomerDtoRequest;
import org.example.app.entity.customer.Customer;
import org.example.app.service.BaseService;

import java.util.List;

public interface CustomerService extends BaseService<Customer, CustomerDtoRequest> {
    Customer create(CustomerDtoRequest request);
    List<Customer> fetchAll();
    Customer fetchById(Long id);
    Customer updateById(Long id, CustomerDtoRequest request);
    boolean deleteById(Long id);
    Customer getLastEntity();

    // ---- Query Params ----------------------
    List<Customer> fetchByFirstName(String firstName);
    List<Customer> fetchByLastName(String lastName);
    List<Customer> fetchAllOrderBy(String orderBy);
}
