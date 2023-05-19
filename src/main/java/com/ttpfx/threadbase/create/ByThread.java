package com.ttpfx.threadbase.create;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ttpfx
 * @date 2023/5/19
 */
@Slf4j(topic = "c.ByThread")
public class ByThread {
    static class MyThread extends Thread{
        @Override
        public void run() {
            log.debug("{}线程正在执行",getName());
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("myThread线程");
        myThread.start();
        log.debug("{}线程正在执行",Thread.currentThread().getName());
    }
}
