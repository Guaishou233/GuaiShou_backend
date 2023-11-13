import com.guai.mapper.user.UserMapper;
import com.guai.pojo.SmbmsUser;
import org.apache.ibatis.session.SqlSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
// Import log4j classes.
import static com.guai.util.MyBatisUtil.sqlSessionFactory;

public class testdb {
    private static final Logger logger = LogManager.getLogger(testdb.class);
    @Test
    public static void main(String[] args) throws Exception {
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        try (
                SqlSession session = sqlSessionFactory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);

            Map<String, Object> mapUser = new HashMap<String,Object>();

            mapUser.put("userCode", "admin");
            SmbmsUser user = mapper.getLoginUser(mapUser);
            System.out.println(user.getUserPassword());
            session.close();
        }


    }
}
