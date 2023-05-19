package com.ttpfx.threadbase.method;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ttpfx
 * @date 2023/5/19
 */
@Slf4j(topic = "c.StartTest")
public class StartTest {

    public static void main(String[] args) {
        // start 用于执行线程
        new Thread(()->log.debug(Thread.currentThread().getName())).start();
    }
}
