package com.caidi.collection.c_023_02_FromHashtableToCHM;


import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class T04_TestConcurrentHashMap {

    static Map<UUID, UUID> m = new ConcurrentHashMap<>();

    static int count = Constants.COUNT;
    static UUID[] keys = new UUID[count];
    static UUID[] values = new UUID[count];
    static final int THREAD_COUNT = Constants.THREAD_COUNT;

    static {
        for (int i = 0; i < count; i++) {
            keys[i] = UUID.randomUUID();
            values[i] = UUID.randomUUID();
        }
    }

    static class MyThread extends Thread {
        int start;
        int gap = count/THREAD_COUNT;

        public MyThread(int start) {
            this.start = start;
        }

        @Override
        public void run() {
            for(int i=start; i<start+gap; i++) {
                m.put(keys[i], values[i]);
            }
        }
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        Thread[] threads = new Thread[THREAD_COUNT];

        for(int i=0; i<threads.length; i++) {
            threads[i] =
            new MyThread(i * (count/THREAD_COUNT));
        }

        for(Thread t : threads) {
            t.start();
        }

        for(Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);

        System.out.println(m.size());

        //-----------------------------------

        start = System.currentTimeMillis();
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(()->{
                for (int j = 0; j < 10000000; j++) {
                    m.get(keys[10]);
                }
            });
        }

        for(Thread t : threads) {
            t.start();
        }

        for(Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}


// 自定义实现  100个线程操作 1000000个集合元素
class MyConcurrentHashMap {

    static Map hashMap = new ConcurrentHashMap();

    // 先准备好1000000个集合元素
    static UUID[] keys = new UUID[Constants.COUNT];
    static UUID[] values = new UUID[Constants.COUNT];
    // 线程数
    static final int THREAD_COUNT = Constants.THREAD_COUNT;

    static {
        for (int i = 0; i <Constants.COUNT ; i++) {
            keys[i]= UUID.randomUUID();
            values[i]= UUID.randomUUID();
        }
    }

    public static void main(String[] args) {

        // 写测试
        long start = System.currentTimeMillis();
        Thread[] threads = new Thread[THREAD_COUNT];
        // 每个线程的写入范围
        for (int i = 0; i <threads.length ; i++) {
            threads[i] = new MyThread01(i * (Constants.COUNT/THREAD_COUNT));
        }

        // 开启线程
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        // 线程排序
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        System.out.println(hashMap.size());

        // 读测试
        start = System.currentTimeMillis();
        Thread[] threadsRead = new Thread[THREAD_COUNT];
        // 每个线程读取1百万次
        for (int i = 0; i <threadsRead.length ; i++) {
            threadsRead[i] = new Thread(()->{
                for (int j = 0; j <1000000 ; j++) {
                    hashMap.get(keys[20]);
                }
            });
        }

        // 开启线程
        for (int i = 0; i < threadsRead.length; i++) {
            threadsRead[i].start();
        }
        // 线程排序
        for (int i = 0; i < threadsRead.length; i++) {
            try {
                threadsRead[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        end = System.currentTimeMillis();
        System.out.println(end-start);
    }


    static class MyThread01 extends Thread{
        // 操作容器的范围
        int startIndex = 0;
        // 每个线程操作元素个数
        int gap = Constants.COUNT/THREAD_COUNT;

        public MyThread01(int index) {
            this.startIndex = index;
        }

        @Override
        public void run() {
            // 模拟存入元素
            for (int i = startIndex; i < startIndex + gap; i++) {
                hashMap.put(keys[i], values[i]);
            }

        }
    }
}
