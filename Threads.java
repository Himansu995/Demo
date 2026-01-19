// like different software works simultanously and in each software different threads works simultanously
// to create thread class just extend thread
// and like i wanna call a b simultanously like 1 hello then 1 hi 
//                      to do so write it in run void(like a inbuilt void of threads)
//                      and to execute this run call obj.start() (also a inbuilt function)
// but to observe it we need to keep thread sleep after each print or wait (by loop) after each print

class A extends Thread{
    // but as we know that multi-inheritance is not allowed so to inhert other class as well as use run we need to use
    //            runnable is functional so lamda exp. is possible
    //            class A extends B implements Runnable { } 
    // but to use it need to create different objects
    //            Runnable obj1=new A()
    //            Thread th1=new Thread(obj1);
    //            th1.start();
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
        
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
        }
        
    }
}



class cal{
    int count=0;
    // Sync. means that 1 thread/obj. will use this function at a time (to avoid case of both thread use same value)
    public synchronized void inc(){
        count++;
    }
}


public class Threads {
    public static void main(String[] args) {
        // A a1=new A();
        // B b1=new B();
        // a1.start();
        // b1.start();

        // a1.getPriority(); // is priortiy by schedular (1 (min) to 10 (max))
        // we can change it but will not affect anything at all bcz it is schedulat wish to do whatever he likes

        cal c1=new cal();
        Runnable r1 = ()-> {
            for(int i=0;i<100;i++){
                c1.inc();
            }
        };
        Runnable r2 = ()-> {
            for(int i=0;i<100;i++){
                c1.inc();
            }
        };

        
        Thread th1=new Thread(r1);
        Thread th2=new Thread(r2);
        th1.start();
        th2.start();
        // Wait for both threads to finish
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(c1.count);


    }
}
