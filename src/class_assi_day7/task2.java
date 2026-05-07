package class_assi_day7;

class OrderTask implements Runnable {
public void run() {
try {
for(int i = 1; i <= 2; i++) {
System.out.println("Order is being processed...");
Thread.sleep(3000);
}
} catch(InterruptedException e) {
System.out.println("Order thread interrupted");
}
}
}

class PaymentTask implements Runnable {
public void run() {
System.out.println("Payment is being processed...");
}
}

class NotificationTask implements Runnable {
public void run() {
System.out.println("Notification sent");
}
}

public class task2 {
public static void main(String[] args) throws Exception {


OrderTask o = new OrderTask();
PaymentTask p = new PaymentTask();
NotificationTask n = new NotificationTask();


Thread t1 = new Thread(o);
Thread t2 = new Thread(p);
Thread t3 = new Thread(n);


t1.setPriority(Thread.MAX_PRIORITY); 
t2.setPriority(Thread.NORM_PRIORITY); 
t3.setPriority(Thread.MIN_PRIORITY); 

t1.start();


t1.join();

t2.start();


t2.join();

t3.start();


System.out.println("Is OrderTask alive? " + t1.isAlive());
System.out.println("Is PaymentTask alive? " + t2.isAlive());
System.out.println("Is NotificationTask alive? " + t3.isAlive());
}
}
