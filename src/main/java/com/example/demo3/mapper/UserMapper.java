package com.example.demo3.mapper;

import com.example.demo3.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from accounts")
    public List<User> getAllUser();
}
