package com.multithread;

/**
 * 描述:
 * ----测试，main方法调用别的线程类, 主线程sleep三秒。
 *
 * @author ma.xiaofeng
 * @create 2018-05-25 14:19
 */
public class ThreadDemo2 {

    public static void main(String[] args) throws InterruptedException {


        Thread.sleep(3000);

        String name = "adf";

        new Thread(new ThreadDemo(name)).start();
        new Thread(new ThreadDemo(name)).start();
    }

}