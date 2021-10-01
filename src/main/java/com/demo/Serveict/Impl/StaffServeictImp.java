package com.demo.Serveict.Impl;

import com.demo.Serveict.StaffServeict;
import com.demo.bean.Staff;
import com.demo.mapper.StafcMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServeictImp implements StaffServeict {
    @Autowired
    private StafcMapper stafcMapper;
    @Override
    public List<Staff> finstaff() {
        return stafcMapper.finstaff();
    }

    @Override
    public int addstaff(Staff staff) {
        return stafcMapper.addstaff(staff);
    }

    @Override
    public int delestaff(Integer id) {
        return stafcMapper.delestaff(id);
    }

    @Override
    public Staff finId(Integer id) {
        return stafcMapper.finId(id);
    }

    @Override
    public int updestaff(Staff staff) {
        return stafcMapper.updestaff(staff);
    }
}
