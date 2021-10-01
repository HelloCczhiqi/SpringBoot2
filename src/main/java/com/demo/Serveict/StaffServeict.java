package com.demo.Serveict;

import com.demo.bean.Staff;

import java.util.List;

public interface StaffServeict {
    List<Staff> finstaff();
    int addstaff(Staff staff);
    int delestaff(Integer id);
    Staff finId(Integer id);
    int updestaff(Staff staff);
}
