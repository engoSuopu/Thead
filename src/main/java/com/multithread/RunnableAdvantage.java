package com.multithread;

/**
 * 描述:
 * ----实现runnable接口的优势。可以多个相同代码去处理同一个资源。
 *
 * @author ma.xiaofeng
 * @create 2018-05-25 14:31
 */
public class RunnableAdvantage implements Runnable{

    int i = 0;

    public void run() {

        while (i<10) {
            System.out.println("当前线程的名字是：  " + Thread.currentThread().getName() +  "i的值是  " + i );
            i++;
        }

    }
}

class method {
    public static void main(String[] args) {
        new Thread(new RunnableAdvantage()).start();
        new Thread(new RunnableAdvantage()).start();
        new Thread(new RunnableAdvantage()).start();
    }
}