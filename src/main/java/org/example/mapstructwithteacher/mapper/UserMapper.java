package org.example.mapstructwithteacher.mapper;

import org.example.mapstructwithteacher.domain.Address;
import org.example.mapstructwithteacher.domain.Client;
import org.example.mapstructwithteacher.dto.AddressDTO;
import org.example.mapstructwithteacher.dto.ClientDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    /*@Mapping(source = "address",target = "location")
    ClientDTO toDto(Client client);
    @Mapping(source = "location",target = "address")
    Client toClient(ClientDTO dto);*/
    @Mapping(target = "firstname",
             expression = "java(client.getFirstname() + \" \" + client.getLastname())")
    ClientDTO withExpression(Client client);
    /*@Mapping(source = "cnt", target = "country")
    @Mapping(source = "cty", target = "city")
    Client toClientWithAddress(ClientDTO dto, AddressDTO addressDTO);*/
    @Mapping(source = "country", target = "cnt")
    @Mapping(source = "city", target = "cty")
    AddressDTO toAddressDTO(Address address);
    @InheritInverseConfiguration
    Address toAddress(AddressDTO addressDTO);
}
