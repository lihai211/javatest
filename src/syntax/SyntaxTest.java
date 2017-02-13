package syntax;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.locks.ReentrantLock;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import sun.net.www.http.HttpClient;

public class SyntaxTest {
		public static void main(String[] args)   {
			//Class<T>
			//Object
		//	ReentrantLock
			PrintStream p;
			try {
				p = new PrintStream("黑蝴蝶.excel");
				p.println("xxxx.asdasd阿萨德");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
}