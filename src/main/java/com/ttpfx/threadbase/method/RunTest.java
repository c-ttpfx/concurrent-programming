package com.ttpfx.threadbase.method;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ttpfx
 * @date 2023/5/19
 */
@Slf4j(topic = "c.RunTest")
public class RunTest {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            log.debug("线程名称:{}",Thread.currentThread().getName());
        });
        // 直接调用run方法并不会创建一个线程
        thread.run();
        thread.start();
    }
}
