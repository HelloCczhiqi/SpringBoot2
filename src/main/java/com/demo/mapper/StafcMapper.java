package com.demo.mapper;

import com.demo.bean.Books;
import com.demo.bean.Staff;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StafcMapper {
    @Select("SELECT * from staff")
    List<Staff> finstaff();
    @Insert("insert into staff values(#{id},#{name},#{sex},#{age},#{position},#{date})")
    int addstaff(Staff staff);
    @Delete("DELETE FROM staff WHERE staff.id=#{id}")
    int delestaff(Integer id);
    @Select("select * from staff where staff.id=#{id}")
    Staff finId(Integer id);
    @Update("update staff set name=#{name},sex=#{sex},age=#{age},position=#{position},date=#{date} where id=#{id}")
    int updestaff(Staff staff);
}
