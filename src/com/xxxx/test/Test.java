package com.xxxx.test;

import com.xxxx.entity.User;
import com.xxxx.mapper.UserMapper;
import com.xxxx.util.GetSqlSession;
import org.apache.ibatis.session.SqlSession;


public class Test {
    public static void main(String[] args) {

        //获取sqlSession对象
     SqlSession session = GetSqlSession.creatSqlSession();

     //
     UserMapper userMapper = (UserMapper) session.getMapper(UserMapper.class);

     //
     User user = userMapper.queryUserByname("admin");
     System.out.println(user);

    }
}
