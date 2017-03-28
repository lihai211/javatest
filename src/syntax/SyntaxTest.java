package syntax;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.meConcurrent.TestSDF;
import sun.net.www.http.HttpClient;

 /**
 * @author admin
 *
 */
//临时随手代码测试类,可以忽略次类
class SyntaxTest {
	 volatile   int    sk[];

 public static void main(String[] args)   {
	 
	 	Integer [] arr=new Integer[] {1,2,3,4,5,6};
	 	Integer []  outarr=new Integer [arr.length];
	 	for(int i=arr.length-1;i>=0;i--){
	 		outarr[arr.length-i-1]=arr[i];
	 	}
	 	
	 	for(int i=0;i<outarr.length;i++){
	 		System.out.println(outarr[i]);
	 	}
	 	
	 	byte[] bytes = ByteBuffer.allocate(4).putInt(0xffffffff).array();
	 	
	 	System.out.println(int.class);
	 	
	   
	 	
 }
}


class SuperClass{
    public int n;
    //SuperClass(){
    //    System.out.println("SuperClass()");
    //}
    SuperClass(int n){
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}
class SubClass extends SuperClass{
    private int n;
    
    SubClass(){
        super(300);
        System.out.println("SuperClass");
        
    }    
    SubClass(int n){
    	super(n);
        System.out.println("SubClass(int n):"+n);
        this.n = n;
    }
}

