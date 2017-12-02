public class ThreadLearning {
    public static int i = 0;//计数器

    public static void main(String[] args) throws Exception {
        for (int j = 0; j < 10000; j++) {//启动1000个线程执行 i++
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(1);//增加并发
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i++;
                    
                }
            });

            thread.start();
        }
        Thread.sleep(2000);//延迟2秒打印，确保10000个线程已经执行完成
        System.out.println(i);
    }
}
