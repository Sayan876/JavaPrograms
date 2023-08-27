class A extends Thread
{
 public void run()
 {
 System.out.println("This is Thread A\t Thread ID: " + Thread.currentThread().getId() + "\tThread Priority: "+Thread.currentThread().getPriority());
 }
}
class B extends Thread
{
 public void run()
 {
 System.out.println("This is Thread B\t Thread ID: " + Thread.currentThread().getId() + "\tThread Priority: "+Thread.currentThread().getPriority());
 }
}
class C extends Thread
{
 public void run()
 {
 System.out.println("This is Thread C\t Thread ID: " + Thread.currentThread().getId() + "\tThread Priority: "+Thread.currentThread().getPriority());
 }
}
class ThreadPriority
{
public static void main(String[]args)
 {
 A threadA = new A();
 B threadB = new B();
 C threadC = new C();
 threadA.setpriority(Thread.MIN_PRIORITY);
 threadB.setpriority(Thread.NORM_PRIORITY);
 threadC.setpriority(Thread.MAX_PRIORITY);
 System.out.println("\nThis is the main thread\t Thread ID: " + Thread.currentThread().getId() + "\tThread priority: " + Thread.currentThread().getPriority() + "\n");
 System.out.println("Let's call the other threads in the sequence A->B->C");
 threadA.start();
 threadB.start();
 threadC.start();
 }
}