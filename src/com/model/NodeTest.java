package com.model;
//注意父类与子类有重名属性,不会出现属性覆盖,各自有各自的属性,如果是调用子类的方法那么this一般是子类

import java.util.ArrayList;
import java.util.List;

public  abstract class NodeTest {
public int id;
public List  <NodeTest> idlist=new ArrayList<>();;
public abstract void callNodeF();

public static void main(String[] args) {
	NodeTest mn=new Mynode();
	mn.callNodeF();
	mn.callNodeF();
	
	NodeTest mn1=new Mynode();
	mn1.callNodeF();
	mn1.callNodeF();
}
	
}


class Mynode extends NodeTest{

			public String name;

			@Override
			public void callNodeF() {
				this.idlist.add(this);
				
			}

		
	}

	


