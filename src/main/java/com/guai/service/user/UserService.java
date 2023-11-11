package com.guai.service.user;

import com.guai.pojo.SmbmsUser;
public interface UserService {
    public SmbmsUser login(String userCode, String userPassword);
}
