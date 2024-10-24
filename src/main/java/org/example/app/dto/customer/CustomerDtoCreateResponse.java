package org.example.app.dto.customer;

import org.example.app.entity.customer.Customer;
import org.springframework.http.HttpStatus;

public record CustomerDtoCreateResponse(
        int statusCode,
        String reasonPhrase,
        boolean success,
        String message,
       Customer  customer) {

    public static final String SUCCESS_MESSAGE = " Customer has been created successfully.";
    public static final String FAILURE_MESSAGE = " Customer has not been created!";

//    public static UserDtoCreateResponse of(boolean isUserCreated, User user) {
//        if (isUserCreated)
//            return new UserDtoCreateResponse(
//                    HttpStatus.OK.value(),
//                    HttpStatus.OK.getReasonPhrase(),
//                    true, SUCCESS_MESSAGE, user);
//        else
//            return new UserDtoCreateResponse(
//                    HttpStatus.NO_CONTENT.value(),
//                    HttpStatus.NO_CONTENT.getReasonPhrase(),
//                    false, FAILURE_MESSAGE, null);
//    }

    public static org.example.app.dto.customer.CustomerDtoCreateResponse of(boolean isCustomerCreated,  Customer  customer) {
        // ternary operator usage
        return (isCustomerCreated) ?
                new org.example.app.dto.customer.CustomerDtoCreateResponse(
                        HttpStatus.OK.value(),
                        HttpStatus.OK.getReasonPhrase(),
                        true, SUCCESS_MESSAGE, customer) :
                new org.example.app.dto.customer.CustomerDtoCreateResponse(
                        HttpStatus.NO_CONTENT.value(),
                        HttpStatus.NO_CONTENT.getReasonPhrase(),
                        false, FAILURE_MESSAGE, null);
    }
}
