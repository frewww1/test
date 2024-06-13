package com.example.test_mabatis;

import com.example.test_mabatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
class TestMabatisApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {

    }

}
