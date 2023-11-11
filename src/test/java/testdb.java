import com.guai.mapper.user.UserMapper;
import com.guai.pojo.SmbmsUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static com.guai.util.MyBatisUtil.sqlSessionFactory;

public class testdb {

    @Test
    public static void main(String[] args) throws Exception {
        try (
                SqlSession session = sqlSessionFactory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            SmbmsUser user = mapper.getLoginUser("admin");
            System.out.println(user.getUserPassword());
            session.close();
        }


    }
}
