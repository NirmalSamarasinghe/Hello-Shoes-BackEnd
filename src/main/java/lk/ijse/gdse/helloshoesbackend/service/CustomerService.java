package lk.ijse.gdse.helloshoesbackend.service;

import lk.ijse.gdse.helloshoesbackend.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    CustomerDTO saveCustomer(CustomerDTO customerDTO);

    List<CustomerDTO> getAllCustomer();

    CustomerDTO getCustomerByID(String customerID);

    void deleteCustomerByID(String customerID);

    void updateCustomer(String id,CustomerDTO customerDTO);
}
