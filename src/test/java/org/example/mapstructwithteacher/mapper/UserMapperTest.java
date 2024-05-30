package org.example.mapstructwithteacher.mapper;

import org.example.mapstructwithteacher.domain.Address;
import org.example.mapstructwithteacher.domain.Client;
import org.example.mapstructwithteacher.dto.AddressDTO;
import org.example.mapstructwithteacher.dto.ClientDTO;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {

    private static final Logger log = LoggerFactory.getLogger(UserMapperTest.class);

    @Test
    void withExpression() {
        ClientDTO dto = UserMapper.INSTANCE.withExpression(new Client(1L,
                "Doniyor",
                "Musayev",
                "doniyor@gmail.com",
                new Address("Uzb", "Tashkent")));
        log.info(dto.toString());
    }

    @Test
    void toAddressDTO() {
        AddressDTO addressDTO = UserMapper.INSTANCE.toAddressDTO(new Address("Uzb", "Tashkent"));
        log.info(addressDTO.toString());
    }

    @Test
    void toAddress() {
        Address russian = UserMapper.INSTANCE.toAddress(new AddressDTO("Russian", "Sankt-Peterburg"));
        log.info(russian.toString());
    }
}