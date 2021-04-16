package com.multithread;

/**
 * 描述:
 * ----实现runnable接口的优势。可以多个相同代码去处理同一个资源。
 *      结论-----  这个情况下，起三条线程，每一条都跑了十次。
 *
 * @author ma.xiaofeng
 * @create 2018-05-25 14:31
 */
public class RunnableAdvantage implements Runnable{



    public void run() {
        int i = 0;
        while (i<10) {
            System.out.println("线程" + Thread.currentThread().getName() + "数了第" + (i++) + "个数字。");
        }

    }
}

class method {
    public static void main(String[] args) {

        RunnableAdvantage advantage = new RunnableAdvantage();
        new Thread(advantage).start();
        new Thread(advantage).start();
        new Thread(advantage).start();
    }
}