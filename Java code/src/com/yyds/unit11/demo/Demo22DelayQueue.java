package com.yyds.unit11.demo;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Demo22DelayQueue {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<OrderDelay> delayQueue = new DelayQueue<>();
        new Thread(() -> {
            //向队列里面放不同延时时间的任务
            delayQueue.offer(new OrderDelay("订单1", 10000));
            delayQueue.offer(new OrderDelay("订单2", 3900));
            delayQueue.offer(new OrderDelay("订单3", 1900));
            delayQueue.offer(new OrderDelay("订单4", 5900));
            delayQueue.offer(new OrderDelay("订单5", 6900));
            delayQueue.offer(new OrderDelay("订单6", 7900));
            delayQueue.offer(new OrderDelay("订单7", 4900));
        }).start();
        // 使用死循环去取，take会阻塞
        while (true) {
            OrderDelay take = delayQueue.take();
            System.out.println(take.getOrderId() + "已超时");
        }
    }

    static class OrderDelay implements Delayed {
        // 订单号
        private final String orderId;
        // 订单失效时间，单位毫秒
        private final long time;

        private OrderDelay(String orderId, long delayTime) {
            this.orderId = orderId;
            // 该元素可在（当前时间+delayTime）毫秒后消费，也就是说延迟消费delayTime毫秒
            this.time = delayTime + System.currentTimeMillis();
        }

        // 重写getDelay方法，返回当前元素的延迟时间还剩余（remaining）多少个时间单位
        @Override
        public long getDelay(TimeUnit unit) {
            long delta = time - System.currentTimeMillis();
            return unit.convert(delta, TimeUnit.MILLISECONDS);
        }

        public String getOrderId() {
            return orderId;
        }

        // 重写compareTo方法，根据我们所实现的代码可以看出，队列头部的元素是最早即将失效的数据元素
        @Override
        public int compareTo(Delayed o) {
            if (this.time < ((OrderDelay) o).time) {
                return -1;
            } else if (this.time > ((OrderDelay) o).time) {
                return 1;
            }
            return 0;
        }
    }
}
