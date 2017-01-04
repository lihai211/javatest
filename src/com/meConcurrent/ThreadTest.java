package com.meConcurrent;

import java.io.Console;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;

import com.meConcurrent.Point.innerPoint;
import com.meConcurrent.Point.mySync;
import com.model.Config;


class Point{
	private static String key;
	private int x;
	public int y;
	public int open;
	public Point(int x,int y,int open) {
			this.x=x;
			this.open=open;
			this.y=y;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + open;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (open != other.open)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	class innerPoint{
		int xx;
		int yy;
		int getkey(){
			key="44";
			return Integer.parseInt(key);
		}
	}
	static  final class mySync{
		public int xx;
		public String yyString;
		public static String callString;
		mySync(){System.out.println("sysc构造"+key);}
	
	}
	
	mySync ms=new mySync();
} 
public class ThreadTest {
	//private static   AtomicLong count =  new AtomicLong(0);
	public  static int count=0;
	public   int countx=0;
	public static Object lock1=new Object(); 
	public static Object lock2=new Object(); 
	public  static Object lock3=new Object(); 
	
	public Point point= new Point(200,100,0);
	
	private    volatile  Integer  look=5000; 
	
    
	public static Config config;

public static void main(String[] args) {
//	MyThread mr=new MyThread();
//	 Thread t1=new Thread(mr);  
//     Thread t2=new Thread(mr);  
//     Thread t3=new Thread(mr);  
//     t1.start();
//     t2.start();
//     t3.start();

	
	
	
//测试静态同步
//	for(int i=0;i<700;i++){
//		Thread kt=new Thread(new Runnable(){
//
//			@Override
//			public void run() {
//				staticFun1();
//				
//			}});
//		kt.start();
//		
//		Thread kt2=new Thread(new Runnable(){
//
//			@Override
//			public void run() {
//				staticFun2();
//				
//			}});
//		kt2.start();
//		
//		
//		Thread kt3=new Thread(new Runnable(){
//
//			@Override
//			public void run() {
//				staticFun3();
//				
//			}});
//		kt3.start();
//	}

	
	
	
//	ThreadTest test=new ThreadTest();
//	   System.out.println("当期point:"+test.point);
//	  final int local=0;
//	for(int i=0;i<200;i++){
//		Thread kt1=new Thread(new Runnable(){
//
//			@Override
//			public void run() {
//		         int c=0;
//				   while (true) {
//					   if (count!=0) {
//						   System.out.println(Thread.currentThread().getName()+"苏醒:");
//						   	break;
//					}else {
//							try {
//								c++;
//								   System.out.println(Thread.currentThread().getName()+"线程睡觉:"+c+"次");
//									Point p=new Point(1, 2, 3);
//									Point p1=new Point(1, 2, 3);
//									  System.out.println(Thread.currentThread().getName()+"memory address hashcode a:"+System.identityHashCode(p));
//									   System.out.println(Thread.currentThread().getName()+"memory address hashcode a:"+System.identityHashCode(p1));
//								Thread.sleep(2000);
//							} catch (InterruptedException e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
//					}
//					
//					
//				}
//			}});
//		kt1.start();
//	}
//
//	try {
//		Thread.sleep(10000);
//		test.point.open=1;
//		test.countx=1;
//		count=1;
//		   System.out.println("结束了当期point:"+test.point.open);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	test.look=2000;
//	System.out.println("我活了");
//	
	
Point point=new Point(1, 2, 3);
mySync m=new  mySync();
m.xx=33;

//innerPoint in=new innerPoint();
System.out.println(point.ms.xx);
}

//测试多个静态方法syn是否同步
public   synchronized   static void staticFun1(){
	
		Config tem=new Config();

	try {
		tem.setLive(8888);
		config=tem;
		Thread.sleep(0);
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("staticFun1函数当前线程:"+Thread.currentThread().getName()+"当前count值"+count++);
	
}
public   synchronized   static void staticFun2(){
	
	try {
		Thread.sleep(0);
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("staticFun2函数当前线程:"+Thread.currentThread().getName()+"+当前count值"+count++);
	
}

public  synchronized    static void staticFun3(){

	try {
		Thread.sleep(0);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("staticFun3函数当前线程:"+Thread.currentThread().getName()+"当前count值"+count++);
	
}

public       void staticFun4(int time){

  while(true){
	  if (this.look!=5000) {
		  break;
	}
	
  }
	
	System.out.println("staticFun4函数当前线程:"+Thread.currentThread().getName()+"当前time值"+this.look);
	
}
}


class MyThread implements Runnable{

   public Object Lock=new Object();
	@Override
	public void run() {
		calc();
		
//		for(int i=0;i<10000;i++){
//			System.out.println(Thread.currentThread().getName()+",456");
//		}

		//System.out.println(Thread.currentThread().getName()+",sum:"+count);
	}
	
		public         static     void calc(){
			
			System.out.println(Thread.currentThread().getName()+"-----------------------------开始执行锁---------------------------------------");
			System.out.println(Thread.currentThread().getName()+"-----------------------------****真正开始执行锁****---------------------------------------");
			System.out.println(Thread.currentThread().getName()+"-----------------------------****xxxxx真正开始执行锁xxx****---------------------------------------");
		
				
			
				for(int i=300;i>150;i--){
					System.out.println();
					ThreadTest.count--;
				}
		

			
			System.out.println(Thread.currentThread().getName()+"----------------------结束执行锁-------------------------");
			System.out.println(Thread.currentThread().getName()+"----------------------****真正结束执行锁*****-------------------------");
			System.out.println(Thread.currentThread().getName()+"----------------------xxxxx****真正结束执行锁*****xxxx-------------------------");
		}
}
	
