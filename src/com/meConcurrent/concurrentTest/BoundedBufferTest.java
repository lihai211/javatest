package com.meConcurrent.concurrentTest;
//如何对并发队列进行测试

public class BoundedBufferTest {
	//测试1:对BoundedBuffer 的基本单元测试
public 	void  testIsEmptyWhenConstructed(){
		BoundeBuffer< Integer> bb=new BoundeBuffer<>(10);
		System.out.println("队列空:"+bb.isEmpty());
		System.out.println("队列满:"+bb.isFull());
	}
//测试1:对BoundedBuffer 的基本单元测试
public void testIsFullAfterPuts() throws InterruptedException{
		BoundeBuffer<Integer> bb=new BoundeBuffer<>(10);
		for(int i=0;i<10;i++){
			bb.put(i);
		}
		System.out.println("队列空:"+bb.isEmpty());
		System.out.println("队列满:"+bb.isFull());
	}

//测试2:并发队列阻塞与响应中断的功能
public void testTakeBlocksWhenEmpty(){
	final BoundeBuffer<Integer> bb=new BoundeBuffer<>(10);
	long LOCKUP_DETECT_TIMEOUT=5000;//
	Thread taker =new Thread(){
		public void run(){
			try {
				int unused=bb.take();
				System.out.println("阻塞功能失败");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
	
	try {
		taker.start();
		Thread.sleep(LOCKUP_DETECT_TIMEOUT);
		taker.interrupt();
		taker.join(LOCKUP_DETECT_TIMEOUT);
		System.out.println("taker是否活着:"+taker.isAlive());
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
}
	public static void main(String[] args) throws InterruptedException  {
		BoundedBufferTest bTest=new BoundedBufferTest();
	//	bTest.testIsEmptyWhenConstructed();
		//bTest.testIsFullAfterPuts();
		bTest.testTakeBlocksWhenEmpty();
		
	}
}
