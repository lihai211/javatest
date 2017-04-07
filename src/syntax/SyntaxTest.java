package syntax;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLClassLoader;
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

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.meConcurrent.TestSDF;

import javassist.URLClassPath;
import sun.net.www.http.HttpClient;
import syntax.dynamic.reflex.StringBuilderTest;

 /**
 * @author admin
 *
 */
//临时随手代码测试类,可以忽略次类
class SyntaxTest {
	 volatile   int    sk[];

 public static void main(String[] args) throws UnsupportedEncodingException   {   
	 String   zhongguo=new      String("李世民".getBytes("utf-8"));     
	   zhongguo=java.net.URLDecoder.decode(zhongguo,"utf-8");    
	 
 }
}


class SuperClass{
	static  List<Integer> getlist(){
		List<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(5);
		return list;
	}
	
	List<Integer>  getChangeList(){
		List<Integer> list=SuperClass.getlist();
		for(Integer node:list){
			list.set(0, 444);
			
		}
		List<SuperClass> sulist=new ArrayList<>();
		SuperClass sc1=new SuperClass(3);
		SuperClass sc2=new SuperClass(4);
		sulist.add(sc1);
		sulist.add(sc2);
		
		for(SuperClass node:sulist){
			node.n+=100;
		}
		return list;
		
	}
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

