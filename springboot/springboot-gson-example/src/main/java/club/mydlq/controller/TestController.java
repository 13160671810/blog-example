package club.mydlq.controller;

import club.mydlq.model.User;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

/**
 * 测试 Controller 类
 *
 * @author mydlq
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public User getTestInfo( ) {
        User user = new User();
        user.setName("测试");
        user.setSex("男");
        user.setBirthday(new Date());
        return user;
    }

}
