package com.forman.theathletic.dao;

import com.forman.theathletic.dto.UserDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO {
    SqlSession session;

    @Autowired
    public UserDAO (SqlSession session) {
        this.session = session;
    }

    private String namespace = "com.forman.theathletic.dao.UserMapper.";

    public List<UserDTO> selectUserList() {
        return session.selectList(namespace + "selectUserList");
    }

    public UserDTO selectUser(int no) {
        return session.selectOne(namespace + "selectUser", no);
    }

    public int insertUser(UserDTO dto) {
        return session.insert(namespace + "insertUser", dto);
    }

    public int updateUser(UserDTO dto) {
        return session.update(namespace + "updateUser", dto);
    }
}
