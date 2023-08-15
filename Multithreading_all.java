import java.lang.*;
import java.util.*;
class Blog extends Thread
{
	private static Object sec = new Object();
	public void run(){
	System.out.println("Blog posts of Drive Easy 1 :");
	System.out.println("Blog posts of Drive Easy 2 :");
	}  
 
}
class Passenger{    
	int seat_no=1023;    
    
	synchronized void driveEasy(int seat_no){    
	System.out.println("Ready for the Ride with DriveEasy...");    
    
	if(this.seat_no < seat_no){    
	System.out.println("Invalid number, follow protocols...");    
	try{
		wait();
	}catch(Exception e)
	{
	}    
	}    
	this.seat_no -= seat_no;    
	System.out.println("Success");    
	}    
    
	synchronized void gain(int seat_no){    
	System.out.println("Permission granted...");    
	this.seat_no += seat_no;    
	System.out.println("Process completed... ");    
	notify();    
	}    
}  

class DriveEasy extends Thread  
{    
    public void run()  
    {    
        for(int i=1; i<5; i++)  
        {    
            try  
            {  
                // thread to sleep for 500 milliseconds  
                 sleep(500);  
                 System.out.println(Thread.currentThread().getName());    
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    } 
} 

class Notify1 extends Thread   
{  
    public void run()  
    {  
        synchronized(this)  
        {  
            System.out.println("Starting of " + Thread.currentThread().getName());  
            try {  
                this.wait();  
            }  
            catch (InterruptedException e) {  
                e.printStackTrace();}  
            System.out.println(Thread.currentThread().getName() + "...notified");  
        }  
    }  
}  
class Notify2 extends Thread {  
    Notify1 notify1;  
    Notify2(Notify1 notify1)  
    {  
        this.notify1 = notify1;  
    }  
    public void run()  
    {  
        synchronized(this.notify1)  
        {  
            System.out.println("Starting of " + Thread.currentThread().getName());  
            try {  
                this.notify1.wait();  
            }  
            catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
            System.out.println(Thread.currentThread().getName() + "...notified");  
        }  
    }  
}   
class Notify3 extends Thread   
{  
    Notify1 notify1;  
    Notify3(Notify1 notify1)  
    {  
        this.notify1 = notify1;  
    }  
    public void run()  
    {  
        synchronized(this.notify1)  
        {  
            System.out.println("Starting of " + Thread.currentThread().getName());  
            // call the notify() method  
            this.notify1.notify();  
            System.out.println(Thread.currentThread().getName() + "...notified");  
        }  
    }  
}   

class ThreadPriority extends Thread   
{  
  public void run()  
	{  
	  System.out.println("DrivEasy ~ Swift and Safe");  
	} 
}   

class Table{  
 synchronized void printTable(int n){//synchronized method  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  

class MyThread1 extends Thread{  
	Table t;  
	MyThread1(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(6);  
	}  
  
}  

class MyThread2 extends Thread{  
	Table t;  
	MyThread2(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(120);  
	}  
}    
public class Multithreading_all{
	public static void main(String args[]){
								
	Scanner input = new Scanner (System.in);
	System.out.println("Menu driven program to find:");	// Menu driven program for various operations on a number
	do
	//while(true)
	 {
		System.out.println("1: Methods");
		System.out.println("2: Thread Priorities");
		System.out.println("3: Synchronize");
		System.out.println("4: EXIT");
		System.out.println("Enter your choice:");
		int ch = input.nextInt();				// Taking input from user
		 switch(ch)
		  {
			case 1:
			
			System.out.println("Methods under multithreading are : A) run()  B) start()  C) sleep()   D) wait()   E) suspend()   F) notify()   G) resume()   H) stop()  ");
			System.out.println("A. Demonstrating run() method:");
			Blog b = new Blog();
			b.run();
			System.out.println("B. Demonstrating start() method:");
			Blog b1 = new Blog();
			b1.start();
			
			System.out.println("C. Demonstrating sleep() method:");
			
			  try {
            			for (int i = 0; i < 5; i++) {
                		Thread.sleep(1000);
                
                		// printing the value of the variable
                		System.out.println(i);
            			}
        		      }
       			 catch (Exception e) {
            
            		// catching the exception
            		System.out.println(e);
        		}
			
			System.out.println("D. Demonstrating wait() method:");
			final Passenger p =new Passenger();    
			new Thread(){    
				public void run()
				{p.driveEasy(15000);}    
				}.start();    
			new Thread(){    
			public void run(){p.gain(10000);}    
			}.start();       
			System.out.println("E. Demonstrating suspend() method:");
			DriveEasy t1=new DriveEasy ();    
        		DriveEasy t2=new DriveEasy ();   
        		DriveEasy t3=new DriveEasy ();   
        		// call run() method   
        		t1.start();  
        		t2.start();  
        		// suspend t2 thread   
       			//t2.suspend();   
        		// call run() method   
        		t3.start();  
			System.out.println("F. Demonstrating notify() method:");
			Notify1 notify1 = new Notify1();  
        		Notify2 notify2 = new Notify2(notify1);  
        		Notify3 notify3 = new Notify3(notify1);  
          
        		// creating the threads   
        		Thread th1 = new Thread(notify1, "Thread-1");  
        		Thread th2 = new Thread(notify2, "Thread-2");  
       			Thread th3 = new Thread(notify3, "Thread-3");  
          
        		// call run() method  
        		th1.start();  
        		th2.start();    
        		th3.start();  
			System.out.println("G. Demonstrating resume() method:");
			DriveEasy tr1=new DriveEasy ();    
        		DriveEasy tr2=new DriveEasy ();   
        		DriveEasy tr3=new DriveEasy (); 
			// call run() method   
        		tr1.start();  
        		tr2.start();  
        		//tr2.suspend(); // suspend t2 thread   
        		// call run() method   
        		tr3.start();   
        		//tr2.resume(); // resume t2 thread 
			System.out.println("H. Demonstrating stop() method:");
			DriveEasy tr11=new DriveEasy ();    
        		DriveEasy tr12=new DriveEasy ();   
        		DriveEasy tr13=new DriveEasy (); 
			// call run() method   
        		tr11.start();  
        		tr12.start();  
        		  
    			tr13.stop(); // stop t3 thread   
			System.out.println("Thread tr13 is stopped");    
			break;

			case 2:
			System.out.println("Methods under Thread Priorities : A) getPriority()  B) setPriority() ");
			ThreadPriority thr1 = new ThreadPriority();  
			ThreadPriority thr2 = new ThreadPriority();  
			ThreadPriority thr3 = new ThreadPriority();  
  
			System.out.println("Priority of the thread th1 is : " + thr1.getPriority());  
			System.out.println("Priority of the thread th2 is : " + thr2.getPriority());  
  			System.out.println("Priority of the thread th2 is : " + thr2.getPriority()); 
			//Setting priorities of above threads by  
			  
			thr1.setPriority(7);  
			thr2.setPriority(2);  
			thr3.setPriority(4);  
  
			System.out.println("Priority of the thread th1 is : " + thr1.getPriority());  
  
 			System.out.println("Priority of the thread th2 is : " + thr2.getPriority());  
	 	 
			System.out.println("Priority of the thread th3 is : " + thr3.getPriority());  
			// Displaying name of the currently executing thread   
			System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
  
			System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
  
  			// Priority of the main thread is 10 now  
			Thread.currentThread().setPriority(10);  
  
			System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
			break;

			case 3:
			System.out.println("Demonstrating Synchronize in JAVA:");
			Table obj = new Table();//only one object  
			MyThread1 tx1=new MyThread1(obj);  
			MyThread2 tx2=new MyThread2(obj);  
			tx1.start();  
			tx2.start();   
			break;

			default: System.out.println("Please enter valid choice:");
					return;

		   } System.out.println("Do you want to continue?[1/0]");
		}while(input.nextInt()==1);
     }

}