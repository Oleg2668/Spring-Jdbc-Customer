package org.example.app.service.customer;

import org.example.app.dto.customer.CustomerDtoRequest;
import org.example.app.entity.customer.Customer;
import org.example.app.dao.customer.CustomerDao;
import org.example.app.service.customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("CustomerServiceImpl")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDao;

    @Override
    public Customer create(CustomerDtoRequest request) {
        Objects.requireNonNull(request,
                "Parameter [request] must not be null!");
        customerDao.create(request);
        return customerDao.getLastEntity()
                .orElse(null);
    }

    @Override
    public List<Customer> fetchAll() {
        return customerDao.fetchAll()
                .orElse(Collections.emptyList());
    }

    @Override
    public Customer fetchById(Long id) {
        Objects.requireNonNull(id,
                "Parameter [id] must not be null!");
        return customerDao.fetchById(id)
                .orElse(null);
    }

    @Override
    public Customer updateById(Long id, CustomerDtoRequest request) {
        Objects.requireNonNull(request,
                "Parameter [request] must not be null!");
        if (id == null) {
            throw new IllegalArgumentException("Id must be provided!");
        }
        if (customerDao.fetchById(id).isPresent()) {
            customerDao.updateById(id, request);
        }
        return customerDao.fetchById(id).orElse(null);
    }

    @Override
    public boolean deleteById(Long id) {
        Objects.requireNonNull(id,
                "Parameter [id] must not be null!");
        if (customerDao.fetchById(id).isPresent()) {
            customerDao.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Customer getLastEntity() {
        return customerDao.getLastEntity()
                .orElse(null);
    }

    // ---- Query Params ----------------------

    public List<Customer> fetchByFirstName(String firstName) {
        return customerDao.fetchByFirstName(firstName)
                .orElse(Collections.emptyList());
    }

    public List<Customer> fetchByLastName(String lastName) {
        return customerDao.fetchByLastName(lastName)
                .orElse(Collections.emptyList());
    }

    public List<Customer> fetchAllOrderBy(String orderBy) {
        return customerDao.fetchAllOrderBy(orderBy)
                .orElse(Collections.emptyList());
    }

}
