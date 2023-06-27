package com.forman.theathletic.service;

import com.forman.theathletic.dao.UserDAO;
import com.forman.theathletic.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    UserDAO dao;

    @Autowired
    public UserService(UserDAO dao) {
        this.dao = dao;
    }

    public List<UserDTO> selectUserList() throws Exception {
        return dao.selectUserList();
    }

    public UserDTO selectUser(int no) throws Exception {
        return dao.selectUser(no);
    }

    public int insertUser(UserDTO dto) throws Exception {
        return dao.insertUser(dto);
    }

    public Integer updateUser(UserDTO dto) throws Exception {
        return dao.updateUser(dto);
    }

}
