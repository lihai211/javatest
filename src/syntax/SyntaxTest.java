package syntax;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

import sun.misc.Unsafe;

 /**
 * @author admin
 *
 */
//临时随手代码测试类,可以忽略次类
class SyntaxTest {
static	int add(int n){
		if(n<=1){
			return 1;
		}else {
			return add(n-1)+n;
		}
	}


static	int recur(int n){
	if(n<=1){
		return 1;
	}else {
		return recur(n-1)*n;
	}
}
	 volatile   int    sk[];
	//   private static final Unsafe unsafe = Unsafe.getUnsafe();
 public static void main(String[] args) throws UnsupportedEncodingException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException   {   

	 	
	 
	 	
	 	
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

