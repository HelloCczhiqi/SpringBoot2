package com;

import com.demo.LoginApplication;
import com.demo.bean.Books;
import com.demo.bean.User;
import com.demo.mapper.Booksmapper;
import com.demo.mapper.LoginMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = LoginApplication.class)
@RunWith(SpringRunner.class)
public class index {
    User user = new User("qwe", "qwe");
    @Resource
    private Booksmapper booksmapper;
    @Resource
    private LoginMapper loginMapper;

    @Test
    public void te() {
        List<Books> books = booksmapper.finAll();
        for (Books ss : books) {
            System.out.println(ss);
        }

    }

    @Test
    public void user() {
        loginMapper.adduser(user);
    }


}
