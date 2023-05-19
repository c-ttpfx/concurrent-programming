package com.ttpfx.threadbase.create;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author ttpfx
 * @date 2023/5/19
 */
@Slf4j(topic = "c.ByFutureTask")
public class ByFutureTask {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<>(()->{
            log.debug("{}正在执行",Thread.currentThread().getName());
            return 100;
        });
        new Thread(futureTask,"futureTask").start();
        Integer ans = futureTask.get();
        log.debug("{}正在执行",Thread.currentThread().getName());
        log.debug("返回结果：{}",ans);
        log.debug("{}执行完毕",Thread.currentThread().getName());
        while (true){

        }
    }
}
