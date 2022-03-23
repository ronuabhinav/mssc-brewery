package guru.springframework.msscbrewery.web.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return  CustomerDto.builder().id(UUID.randomUUID()).customerName("Abhinav Trivedi").build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //to do
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        //to do
        log.debug("Deletting a Customer");
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).customerName("Abhinav").build();
    }
}
