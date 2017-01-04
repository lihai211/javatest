package com.model;

import java.io.FileFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import org.omg.CORBA.PUBLIC_MEMBER;

import javafx.scene.control.Tab;

public class test {
	public static void main(String[] args) {
		
		
		
//		ExecutorService threadPool = Executors.newSingleThreadExecutor();
//		Future<Integer> future = threadPool.submit(new Callable<Integer>() {
//			public Integer call() throws Exception {
//				Thread.sleep(5000);// 可能做一些事情
//				System.out.println("线程");
//				return new Random().nextInt(100);
//			}
//		});
//		try {
//			// Thread.sleep(5000);// 可能做一些事情
//			System.out.println("准备开始堵塞");
//			System.out.println(future.get());
//			System.out.println("堵塞结束");
//
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			e.printStackTrace();
//		}
		
		
		Object lock=new Object();

		Thread t1=  new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i=1;
			
				synchronized (lock) {
			while(true){
				try {
			
					 if (i%5==0) {
							lock.wait();
						}else {
							lock.notify();
						}
					System.out.println(Thread.currentThread().getName()+":"+i+"次");
						     Thread.sleep(500);  
						    
						     i++;
				     
					}
				 catch(InterruptedException ex) {  
				    	
				          System.out.println("响应中断");
				          return;
				         
				    }  
			}
				}
				
			   }
				
			
		});
		
	
		
		
	Thread t2=  new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i=1;
				synchronized (lock) {
			while(true){
				try {
			
				        if (i%5==0) {
							lock.wait();
						}else {
							lock.notify();
						}
			 
							System.out.println(Thread.currentThread().getName()+":"+i+"次");
						     Thread.sleep(500);  
						     i++;
					}
					
				    catch(InterruptedException ex) {  
				    	
				          System.out.println("响应中断");
				          return;
				         
				    }
				}
				    
				}
				
			}
		});
	
	
	Thread t3=  new Thread(new Runnable() {
		
		@Override
		public void run() {
			int i=1;
			synchronized (lock) {
		while(true){
			try {
		
		        if (i%5==0) {
									lock.wait();
								}else {
									lock.notify();
								}
						System.out.println(Thread.currentThread().getName()+":"+i+"次");
					     Thread.sleep(500);  
					     i++;
				}
				
			    catch(InterruptedException ex) {  
			    	
			          System.out.println("响应中断");
			          return;
			         
			    }
			}
			    
			}
			
		}
	});
		
	
	Thread t4=  new Thread(new Runnable() {
		
		@Override
		public void run() {
			int i=1;
			synchronized (lock) {
		while(true){
			try {
		
			        if (i%10==0&&i>10) {
						lock.notifyAll();
						break;
			        }
		 
						System.out.println(Thread.currentThread().getName()+":"+i+"次");
					     Thread.sleep(500);  
					     i++;
				}
				
			    catch(InterruptedException ex) {  
			    	
			          System.out.println("响应中断");
			          return;
			         
			    }
			}
			    
			}
			
		}
	});
	
	
Thread t5=  new Thread(new Runnable() {
		
		@Override
		public void run() {
			int i=1;

		while(!Thread.currentThread().isInterrupted()){
			try {
		
		
		 
						System.out.println(Thread.currentThread().getName()+":"+i+"次:"+Thread.currentThread().isInterrupted());
					     Thread.sleep(500);  
					     i++;
					     if (i%5==0) {
					         //Thread.currentThread().interrupt();
					         System.out.println("*:"+Thread.currentThread().isInterrupted());
					        // Thread.currentThread().interrupted();
						}
				}
				
			    catch(InterruptedException ex) {  
			    	//System.out.println("isInterrupted1:"+Thread.currentThread().isInterrupted());
			  //  	System.out.println("isInterrupted2:"+Thread.currentThread().isInterrupted());
			    	//System.out.println("isInterrupted3:"+Thread.currentThread().isInterrupted());
			          System.out.println("响应中断");
			          Thread.currentThread().interrupt(); //外层有while(!Thread.currentThread().isInterrupted())判断，这里一般都这样写，或者直接return
			          //return;
			         
			    }
			
			    
			}
			
		}
	});
	//t1.start();
	//t2.start();
	//t3.start();
	//t4.start();



			System.out.println("Thread.currentThread().interrupted():"+Thread.currentThread().interrupted());
			System.out.println(Thread.currentThread().isInterrupted());;
			System.out.println("Thread.currentThread().interrupted():"+Thread.currentThread().interrupted());
			System.out.println("main1:"+Thread.currentThread().isInterrupted());
			Thread.currentThread().interrupt();
			System.out.println("main2:"+Thread.currentThread().isInterrupted());
			Thread.currentThread().interrupt();
			System.out.println("main3:"+Thread.currentThread().isInterrupted());
			System.out.println("Thread.currentThread().interrupted1():"+Thread.currentThread().interrupted());
			System.out.println("Thread.currentThread().interrupted2():"+Thread.currentThread().interrupted());
			System.out.println("mainisInterrupted:"+Thread.currentThread().isInterrupted());
			Thread.currentThread().interrupt();
			System.out.println("mainisInterrupted:"+Thread.currentThread().isInterrupted());
			System.out.println("Thread.currentThread().interrupted2():"+Thread.currentThread().interrupted());
			t5.start();
		//	Unsafe
			//LockSupport
			//ExecutorService
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		t5.interrupt();
	
		

	
	
	
	
	
	
	
	
	
	
	
	
	}
	


	
 
	
}
