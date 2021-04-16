package com.multithread;

/**
 * 描述:
 * ----多线程的学习
 *
 * @author ma.xiaofeng
 * @create 2018-05-25 14:10
 */
public class ThreadDemo implements Runnable {

    private String name;

    public ThreadDemo(String name) {
        this.name = name;
    }


    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "运行   +    "+  i);

        }
    }


}