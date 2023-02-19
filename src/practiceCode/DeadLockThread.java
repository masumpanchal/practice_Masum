package practiceCode;

public class DeadLockThread {
    public static void main(String[] args){
        final String obj1 = "Object1";
        final String obj2 = "Object2";

        Thread th1 = new Thread() {
            public void run(){
                synchronized (obj1){
                System.out.println(Thread.currentThread().getName() + " is holding " + obj1);
                try {
                    Thread.sleep(100);
                }
                catch (Exception e){

                }
                System.out.println(Thread.currentThread().getName() + " is waiting for " + obj2);
                     synchronized (obj2) {
                         System.out.println(Thread.currentThread().getName()+"is holding " + obj2);
                  }
                }
            }
        };
        Thread th2 = new Thread(){
                public void run(){
                    synchronized (obj2){
                        System.out.println(Thread.currentThread().getName() + " is holding " + obj2);
                        try {
                            Thread.sleep(100);
                        }
                        catch (Exception e){

                        }
                        System.out.println(Thread.currentThread().getName() + " is waiting for " + obj1);
                        synchronized (obj1) {
                            System.out.println(Thread.currentThread().getName()+"is holding " + obj1);
                        }
                    }
                }
        };
        th1.start();
        th2.start();
    }
}
