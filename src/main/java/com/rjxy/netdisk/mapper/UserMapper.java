package com.rjxy.netdisk.mapper;


import com.rjxy.netdisk.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author zhy
 * @create 2017-11-03 00:15
 **/
@Mapper
public interface UserMapper {
    void insertAdmin(User user);
    User getUserByUserId(@Param("userId") int userId);
    User judgeUser(User user);
}
