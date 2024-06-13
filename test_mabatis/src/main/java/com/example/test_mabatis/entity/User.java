package com.example.test_mabatis.entity;

import com.baomidou.mybatisplus.annotation.TableId;

public class User {
    @TableId
    Long id;
    String name;
    int age;
}
