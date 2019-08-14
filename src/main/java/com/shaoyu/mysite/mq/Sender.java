package com.shaoyu.mysite.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 生产者
 * @author leeshaoyu
 * @description
 * @date 2019/8/13
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 发消息
     */
    public void send(String msg){
        //向消息队列发消息
        this.amqpTemplate.convertAndSend("first-queue", msg);
    }
}
