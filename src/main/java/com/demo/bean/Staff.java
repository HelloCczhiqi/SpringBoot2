package com.demo.bean;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String position;
    private Date date;


}
