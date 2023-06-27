package com.forman.theathletic.service;

import com.forman.theathletic.dto.UserDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserServiceTest {
    @Autowired
    UserService service;

    @Test
    public void testInsertUser() throws Exception {
        UserDTO dto = UserDTO.builder()
                .userid("wngus2431")
                .password("1234")
                .username("park")
                .email("wngus@gmail.com")
                .sex("man")
                .phone("010-6777-4214")
                .build();

        service.insertUser(dto);
    }

    @Test
    public void testSelectOne() throws Exception {
        UserDTO dtos = service.selectUser(1);
        System.out.println("dtos = " + dtos);
    }

    @Test
    public void testSelectAll() throws Exception {
        List<UserDTO> dtos = service.selectUserList();
        for (UserDTO dto:dtos) {
            System.out.println("dto = " + dto);
        }
    }

    @Test
    public void testUpdate() throws Exception {
        UserDTO dto = UserDTO.builder()
                .no(1)
                .userid("zzzz")
                .username("박박")
                .password("4321")
                .sex("남자")
                .email("wngus24311@naver.com")
                .phone("010-1234-1234")
                .build();
        int temp = service.updateUser(dto);

        System.out.println("temp = " + temp);
        System.out.println(service.selectUser(1));
    }
}