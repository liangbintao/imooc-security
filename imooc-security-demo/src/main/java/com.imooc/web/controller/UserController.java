package com.imooc.web.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.imooc.dto.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserControllerTest
 * @Description TODO
 * @Auther lbt
 * @Date 2019/5/1/001 12:11
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    @ApiOperation(("创建账户"))
    public User create(@Valid @RequestBody User user) {

        /*if (errors.hasErrors()) {
            errors.getAllErrors().stream().forEach(resources.error -> System.out.println(resources.error.getDefaultMessage()));
        }*/

        user.setId(1L);

        return user;
    }

    @GetMapping
    @JsonView(User.UserSimpleView.class)
    @ApiOperation("用户查询服务")
    public List<User> query(@RequestParam @ApiParam("用户名") String username) {

        List<User> list = new ArrayList<>();

        list.add(new User());
        list.add(new User());
        list.add(new User());

        return list;
    }

    @GetMapping("/{id:\\d+}")
    @JsonView(User.UserDetailView.class)
    public User getInfo(@PathVariable String id) {

        // throw new RuntimeException("user not exist");
        User user = new User();
        user.setId(1L);
        user.setUsername("tom");
        user.setPasswrod("123");

        return user;
    }
}