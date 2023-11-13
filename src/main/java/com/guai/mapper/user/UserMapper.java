package com.guai.mapper.user;

import com.guai.pojo.SmbmsUser;

import java.util.Map;

public interface UserMapper {
    //查找用户返回用户的信息
    SmbmsUser getLoginUser(Map<String,Object> map) throws Exception;

}
