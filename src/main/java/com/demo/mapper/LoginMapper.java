package com.demo.mapper;

import com.demo.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {
    @Select("select * from user where  username=#{username} and password=#{password}")
    User getUser(@Param("username") String name, @Param("password") String password);


    @Insert("insert into user values (username=#{username},password=#{password})")
    int adduser(User user);

    @Insert("insert into user values (username=#{username},password=#{password})")
    int inset(String username, String password);

}
