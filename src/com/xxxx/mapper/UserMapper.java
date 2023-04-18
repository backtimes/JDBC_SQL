package com.xxxx.mapper;

import com.xxxx.entity.User;

/*
  用户接口
 */
public interface UserMapper {
    public User queryUserByname(String userName);
}
