package com.demo.Controller;

import com.demo.Serveict.Impl.UserServictImpl;
import com.demo.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class indexcontroller {
    @Resource
    private UserServictImpl userServict;

    public UserServictImpl getUserServict() {
        return userServict;
    }

    public void setUserServict(UserServictImpl userServict) {
        this.userServict = userServict;
    }

    @RequestMapping("/user/index")
    public String index(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session, Model model) {
        User user1 = userServict.getUser(username, password);
        if (user1 != null) {
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "账号或密码错误");
            return "index";
        }

    }

    @RequestMapping("/user/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/index.html";
    }

    @GetMapping("/useradd")
    public String adduser() {
        return "emp/user";
    }

    @PostMapping("/useradd")
    public String useradd(User user) {
        userServict.adduser(user);
        return "redirect:/index.html";
    }
}
