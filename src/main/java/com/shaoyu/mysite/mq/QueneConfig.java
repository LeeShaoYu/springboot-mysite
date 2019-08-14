package com.shaoyu.mysite.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author leeshaoyu
 * @description
 * @date 2019/8/13
 */
@Configuration
public class QueneConfig {
    /**
     *  创建队列
     * @author leeshoayu
     * @date
     * @param
     * @return
     */

    @Bean
    public Queue createQueue(){
        return new Queue("first-queue");
    }
}
