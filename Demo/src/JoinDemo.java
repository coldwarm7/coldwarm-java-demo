//匿名类不能实现join方法

//sleep()不释放同步锁,wait()释放同步缩.
//wait() 是 Object 的方法，而 sleep() 是 Thread 的静态方法；

public class JoinDemo {
    public static void main(String[] args) {
        joinFunction();
    }


    public static void joinFunction(){
        Thread thread1 = new Thread(() -> {
            try {

                Thread.sleep(2000);


            }catch (Exception e){

            }finally {
                System.out.println("A");
            }
        });


        Thread thread2 = new Thread(() -> {
            try {
                thread1.join();
                //Thread.sleep(2000);
            }catch (Exception e){

            }finally {
                System.out.println("B");
            }
        });

        thread2.start();
        thread1.start();
    }
}
