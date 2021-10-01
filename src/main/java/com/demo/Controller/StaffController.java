package com.demo.Controller;

import com.demo.Serveict.StaffServeict;
import com.demo.bean.Books;
import com.demo.bean.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StaffController {
    @Autowired
    private StaffServeict staffServeict;
    @RequestMapping("/staff")
    public String staffs(Model model){
        List<Staff> finstaff = staffServeict.finstaff();
        model.addAttribute("staff",finstaff);
        return "staff/stafc";
    }
    @GetMapping("/addstafc")
    public String addsta(){
        return "staff/text/Stafcadd";
    }
    @PostMapping("/addstafc")
    public String sta(Staff staff){
        staffServeict.addstaff(staff);
        return "redirect:/staff";
    }
    @GetMapping("/delestaff/{getId}")
    public String dele(@PathVariable("getId") Integer id){
        staffServeict.delestaff(id);
        return "redirect:/staff";
    }
    @GetMapping("/updeatstaff/{getId}")
    public String updet(@PathVariable("getId") Integer id,Model model){
        Staff staff = staffServeict.finId(id);
        model.addAttribute("staff",staff);
        return "staff/updeteaa";
    }
    @PostMapping("/updeatstaff/{getId}")
    public String ddd(@PathVariable("getId") Integer id ,Staff staff){
        staff.setId(id);
        staffServeict.updestaff(staff);
        return "redirect:/staff";
    }

}
