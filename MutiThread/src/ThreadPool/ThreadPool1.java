package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * JavaLab
 * ThreadPool1
 * 线程池相关应用
 *
 * @author Yixiong J
 * @version 2019/11/9 22:46
 */
public class ThreadPool1 {
    public static void main(String[] args) {
//      创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);
//      从线程池中获取线程，并通过获取的线程执行指定的任务
        pool.submit(new RunnableTask1());
        pool.submit(new RunnableTask1());
        pool.submit(new RunnableTask1());
        pool.submit(new RunnableTask1());
        pool.submit(new RunnableTask1());
//      任务执行完毕后自动归还会线程池，所以可以重复使用（可见输出中线程名字会有重复）
    }
}
