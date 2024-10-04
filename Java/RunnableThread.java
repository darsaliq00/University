



public class RunnableThread implements Runnable{
    public void run(){
        System.out.println("Thread has Ended");
    }

    public static void main(String[] args) {
        RunnableThread e = new RunnableThread();
        Thread t = new Thread(e);

        t.start();
        System.out.println("HI!!");
    }
}
