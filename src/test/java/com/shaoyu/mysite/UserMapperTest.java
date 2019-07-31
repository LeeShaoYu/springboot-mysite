package com.shaoyu.mysite;

import com.shaoyu.mysite.dao.UserMapper;
import com.shaoyu.mysite.domain.UserDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MysiteApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void selectUserTest(){
        UserDO user = userMapper.selectUser("lishaoyu", "lsy123455");
        Assert.assertNotNull("用户不存在", user);
    }
}
