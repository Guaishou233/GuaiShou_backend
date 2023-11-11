//package com.guai.mapper.user;
//
//
//import com.guai.mapper.BaseDao;
//import com.guai.pojo.SmbmsUser;
//
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//public class UserMapperImp implements UserMapper {
//
//    @Override
//    public SmbmsUser getLoginUser(String userCode) throws Exception {
//        SmbmsUser user = null;
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//        System.out.println("connetction"+connection );
//        if (connection != null) {
//            String sql = "select * from smbms_user where userCode=?";
//            Object[] params = {userCode};
//            rs = BaseDao.execute(connection, ps, rs, sql, params);
//            System.out.println("rs" + rs);
//            if (rs.next()) {
//                user = new SmbmsUser();
//                user.setId(rs.getInt("id"));
//                user.setUserCode(rs.getString("userCode"));
//                user.setUserName(rs.getString("userName"));
//                user.setUserPassword(rs.getString("userPassword"));
//                user.setGender(rs.getInt("gender"));
//                user.setBirthday(rs.getDate("birthday"));
//                user.setPhone(rs.getString("phone"));
//                user.setAddress(rs.getString("address"));
//                user.setUserRole(rs.getInt("userRole"));
//                user.setCreatedBy(rs.getInt("createdBy"));
//                user.setCreationDate(rs.getTimestamp("creationDate"));
//                user.setModifyBy(rs.getInt("modifyBy"));
//                user.setModifyDate(rs.getTimestamp("modifyDate"));
//            }
//            BaseDao.closeResource(null, ps, rs);
//        }
//
//        return user;
//    }
//}
//
//
