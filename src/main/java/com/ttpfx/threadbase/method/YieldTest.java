package com.ttpfx.threadbase.method;

import lombok.extern.slf4j.Slf4j;

import static java.lang.Thread.sleep;

/**
 * @author ttpfx
 * @date 2023/5/19
 */
@Slf4j(topic = "c.YieldTest")
public class YieldTest {

    public static void main(String[] args) throws InterruptedException {
        // 给调度器的提示，表明当前线程愿意放弃当前对处理器的使用。调度器可以自由地忽略此提示
        Thread thread = new Thread(() -> {
            int k = 0;
            while (true){
                log.debug("count -> {}", k++);
                Thread.yield();
            }
        }, "t1");
        thread.start();
    }
}
