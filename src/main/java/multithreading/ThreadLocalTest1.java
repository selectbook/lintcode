package multithreading;

public class ThreadLocalTest1 {
    // (1)创建线程变量
    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        // (2)设置线程变量
        threadLocal.set("hello world");
        // (3)启动子线程
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // (4)子线程输出线程变量的值
                System.out.println("thread:" + threadLocal.get());
            }
        });
        thread.start();
        // (5)主线程输出线程变量的值
        System.out.println("main:" + threadLocal.get());
    }
}
