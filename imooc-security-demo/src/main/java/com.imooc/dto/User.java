package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @ClassName User
 * @Description TODO
 * @Auther lbt
 * @Date 2019/5/1/001 12:14
 * @Version 1.0
 */
public class User {

    public interface UserSimpleView {
    }

    ;

    public interface UserDetailView extends UserSimpleView {
    }

    ;

    @JsonView(UserSimpleView.class)
    @ApiModelProperty("唯一ID")
    private Long id;

    @JsonView(UserSimpleView.class)
    @ApiModelProperty("用户名")
    private String username;

    @NotBlank(message = "密码不能为空")
    @JsonView(UserDetailView.class)
    @ApiModelProperty("密码")
    private String passwrod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswrod() {
        return passwrod;
    }

    public void setPasswrod(String passwrod) {
        this.passwrod = passwrod;
    }
}
