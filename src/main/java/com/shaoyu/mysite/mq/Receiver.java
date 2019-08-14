package com.shaoyu.mysite.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 * @author leeshaoyu
 * @description
 * @date 2019/8/13
 */
@Component
public class Receiver {
    /**
     * 接收消息，队列监听
     */
    @RabbitListener(queues = "first-queue")
    public void process(String msg){
        System.out.println("receiver:" +msg);
    }
}
