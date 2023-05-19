package com.ttpfx.threadbase.create;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ttpfx
 * @date 2023/5/19
 */
@Slf4j(topic = "c.ByRunnable")
public class ByRunnable {

    public static void main(String[] args) {
        Runnable runnable = () -> log.debug("实现runnable接口");
        new Thread(runnable,"runnable接口方式").start();
        log.debug("主线程执行");
    }
}
