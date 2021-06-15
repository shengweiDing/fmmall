package mapper;


import com.zhiyou.ApiApplication;
import com.zhiyou.fmmall.mapper.UserMapper;
import com.zhiyou.fmmall.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiApplication.class)
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void queryUserByName() {
        User user = userMapper.queryUserByName("Lilei");
        System.out.println(user);
    }
}