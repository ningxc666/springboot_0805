package com.atguigu.adminboot.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user")
public class User {
    /**
     * 所有属性都应该存在于数据库中,如果表中不存在，可以使用@TableField(exist = false)注解。
     */
    @TableField(exist = false)
    private String userName;
    @TableField(exist = false)
    private String password;

    private Integer id;
    private String name;
    private Integer age;
    private String email;
}
