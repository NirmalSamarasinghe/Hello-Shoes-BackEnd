package lk.ijse.gdse.helloshoesbackend.util;

import lk.ijse.gdse.helloshoesbackend.dto.CustomerDTO;
import lk.ijse.gdse.helloshoesbackend.entity.CustomerEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ConversionData {
    final private ModelMapper modelMapper;

    public CustomerDTO convertoCustomerDTO(Optional<CustomerEntity> customerEntity){
        return modelMapper.map(customerEntity,CustomerDTO.class);
    }
    public CustomerEntity convertToCustomerEntity(Optional<CustomerDTO> customerDTO){
        return modelMapper.map(customerDTO,CustomerEntity.class);
    }
    public List<CustomerDTO>getCustomerDTOList(List<CustomerEntity> customerEntityList){
        return modelMapper.map(customerEntityList,List.class);
    }
    public List<CustomerEntity>getCustomerEntityList(List<CustomerDTO> customerDTOList){
        return modelMapper.map(customerDTOList,List.class);
    }
}