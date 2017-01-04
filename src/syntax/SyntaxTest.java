package syntax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SyntaxTest {
		public static void main(String[] args) throws InterruptedException {
			//FutureTask
			System.out.println(Runtime.getRuntime().totalMemory());
			System.out.println(Runtime.getRuntime().availableProcessors()); //cpu可用核数
			int key=0;
			switch (key) {
			case 0: 
				System.out.println("p0");
			//	break;
			case 1:
				System.out.println("p1");
			//	break;
			case 2:
				System.out.println("p2");
			//	break;
			
			case 3:
				System.out.println("p3");
				break;
			default:
				break;
			}
			
//		int i=0;
//		while (true) {
//			System.out.println((i++)+"次");
//			Thread.sleep(1000);
//				if(i==7){
//		
//					System.exit(1);
//				}
//		}

			
			 List<String> a = new ArrayList();
			 a.add("String"); 
			 List<?> b = a; 
			 System.out.println(a.get(0));
			 
			 Single s1=Single.getInstance();
			 Single s2=Single.getInstance();
}
		

}

;
class Single{
	private Single(String name){
		System.out.println("私有构造函数参数");
	}
	
	public static Single singleObj=null;
	public   synchronized  static  Single getInstance(){
		if (singleObj==null) {
			singleObj=new Single("黑米");
		}
		return singleObj;
	} 
};
class P {
	public int id;
}

class P1{
	public String name;
}

class c extends P{
	
}

interface ip{
	void psay();
}

interface ip1{
	void p1say();
}

interface c1 extends ip,ip1{
	
}

class c1impl implements c1{

	@Override
	public void psay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void p1say() {
		// TODO Auto-generated method stub
		
	}
	
}

