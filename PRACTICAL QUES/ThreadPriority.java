/*  ques 21:-
            Write a program to demonstrate priorities among multiple threads.
    solution:-
*/
public class ThreadPriority extends Thread {
    public void run() {
        System.out.println("Now, inside the run method");
    }

    public static void main(String[] args) {
        ThreadPriority my_thr_1 = new ThreadPriority();
        ThreadPriority my_thr_2 = new ThreadPriority();
        System.out.println("The thread priority of first thread is : " + my_thr_1.getPriority());
        System.out.println("The thread priority of first thread is : " + my_thr_2.getPriority());
        my_thr_1.setPriority(5);
        my_thr_2.setPriority(3);
        System.out.println("The thread priority of first thread is : " + my_thr_1.getPriority());
        System.out.println("The thread priority of first thread is : " + my_thr_2.getPriority());
        System.out.print(Thread.currentThread().getName());
        System.out.println("The thread priority of main thread is : " +
                Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("The thread priority of main thread is : " +
                Thread.currentThread().getPriority());
    }
}