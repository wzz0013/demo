package com.example.nanqi.mapper;

import com.example.nanqi.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
     List<User> findAll();
     User findOneUser(@Param("id") String id);
}
