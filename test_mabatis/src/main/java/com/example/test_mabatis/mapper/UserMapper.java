package com.example.test_mabatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.test_mabatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
