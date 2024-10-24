package org.example.app.dto.customer;

import org.example.app.entity.customer.Customer;
import org.springframework.http.HttpStatus;

public record CustomerDtoGetLastEntityResponse(
        int statusCode,
        String reasonPhrase,
        boolean success,
        String message,
        Customer customer) {

    public static final String SUCCESS_MESSAGE = "Customer has been fetched successfully.";
    public static final String FAILURE_MESSAGE = "Customer has not been found!";

    public static org.example.app.dto.customer.CustomerDtoGetLastEntityResponse of(boolean isCustomerFound, Customer customer) {
        if (isCustomerFound)
            return new org.example.app.dto.customer.CustomerDtoGetLastEntityResponse(
                    HttpStatus.OK.value(),
                    HttpStatus.OK.getReasonPhrase(),
                    true, SUCCESS_MESSAGE, customer);
        else
            return new org.example.app.dto.customer.CustomerDtoGetLastEntityResponse(
                    HttpStatus.NOT_FOUND.value(),
                    HttpStatus.NOT_FOUND.getReasonPhrase(),
                    false, FAILURE_MESSAGE, null);
    }
}
