package com.shaoyu.mysite;

import com.shaoyu.mysite.mq.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/13
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MysiteApplication.class)
public class QueueTest {

    @Autowired
    private Sender sender;

    @Test
    public void testSender(){
        this.sender.send("你好，蔡徐坤");
    }
}
