package com.ttpfx.threadbase.method;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ttpfx
 * @date 2023/5/19
 */
@Slf4j(topic = "c.SleepTest")
public class SleepTest {
    public static void main(String[] args) throws InterruptedException {
        log.debug("");
        // 休眠，时间精确度取决于
        Thread.sleep(5000);
        log.debug("");
    }
}
