package day39_Collections.multiTread;

public class ThreadHelloWorld extends Thread { // thread can be used if it is not going to extend any other classes, interface can be implemented in this case




    int threadNumber;

    public ThreadHelloWorld(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {// you have to specify the code fragment you want to execute within RUN method, which will run whenever start method is called
        //super.run();
        for (int i = 1; i < 5; i++) {
            System.out.println("Hello World "+i+ " from thread "+threadNumber);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
