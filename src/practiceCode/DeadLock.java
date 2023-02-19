package practiceCode;

public class DeadLock {
    public static void main(String[] args){
        DeadLock ob = new DeadLock();
        ob.method1();
        ob.method2();
    }
    public void method1(){
        synchronized (String.class){
            System.out.println("Aquired lock on String.class object");
            synchronized (Integer.class){
                System.out.println("Aquired lock on Integer.class object");
            }
        }
    }

    public void method2(){
        synchronized (String.class){
            System.out.println("Aquired lock on String.class object");
            synchronized (Integer.class){
                System.out.println("Aquired lock on Integer.class object");
            }
        }
    }
}
