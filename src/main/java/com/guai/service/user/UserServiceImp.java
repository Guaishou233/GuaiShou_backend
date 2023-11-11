//package com.guai.service.user;
//
//import com.guai.mapper.BaseDao;
//import com.guai.mapper.user.UserMapper;
//
//import com.guai.pojo.SmbmsUser;
//
//
//import java.sql.Connection;
//
//public class UserServiceImp implements UserService {
//    private UserMapper userMapper;
//
//    public UserServiceImp() {
//        userMapper = new UserMapperImp();
//    }
//
//    @Override
//    public SmbmsUser login(String userCode, String userPassword) {
//        //获取输入账户和密码
//        Connection connection = null;
//        SmbmsUser user = null;
//        connection = BaseDao.getConnection();
//        try {
//            user = userMapper.getLoginUser(userCode);
//            System.out.println(user.getUserCode() + user.getUserPassword());
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            BaseDao.closeResource(connection, null, null);
//        }
//
//        //判断密码
//        if (user != null) {
//            if (!user.getUserPassword().equals(userPassword))
//                user = null;
//        }
//
//        return user;
//    }
//
//
//}
