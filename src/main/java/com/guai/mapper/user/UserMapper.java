package com.guai.mapper.user;

import com.guai.pojo.SmbmsUser;

public interface UserMapper {
    //查找用户返回用户的信息
    public SmbmsUser getLoginUser(String userCode) throws Exception;

}
