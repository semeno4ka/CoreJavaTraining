package day39_Collections.multiTread;

public class TestMultiThreads {
    public static void main(String[] args) {


        Thread thread1 = new ThreadHelloWorld(1);
        Thread thread2 = new ThreadHelloWorld(2);
        Thread thread3 = new ThreadHelloWorld(3);
        ThreadHelloWorld thread4 = new ThreadHelloWorld(4);
        ThreadHelloWorld thread5 = new ThreadHelloWorld(5);

        thread1.start();// whenever start is executed, the run method from child class will run
        thread2.start();// Only START method allows same time execution, run method doesn't allow it, run method only is needed for us to implement it within start for same time execution
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
