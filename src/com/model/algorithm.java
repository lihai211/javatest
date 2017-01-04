package com.model;  

import java.util.ArrayList; 
import java.util.List;
import java.util.Stack;

import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class algorithm {  
		public static void main(String[] args) {
			Stack<String> stack =new Stack<>();
			stack.push("a");
			stack.push("b");
			stack.push("c");
			stack.add("d");
			System.out.println(stack.peek());
			stack.pop();
			System.out.println(stack);
			
			
			Stack<Node> sk =new Stack<>();
			
			Configuration cfg = new AnnotationConfiguration();
	        cfg.configure();
	        //建立SessionFactory  
	        SessionFactory factory = cfg.buildSessionFactory(); 
	        Session session = factory.openSession();
	          Query query= session.createQuery(" select id,name,pid from Node"); 
	          
	          List<Node> nodeList=new ArrayList<>();
	          List<Node> rList=new ArrayList<>();
	          List list =query.list();
	          for(int i=0;i<list.size();i++){
	        	  Object[] objects=(Object[])list.get(i);
	        	  Node node=new Node();
	        	  node.setId((int)objects[0]);
	        	  node.setName((String)objects[1]);
	        	  node.setPid((int)objects[2]);
	        	  nodeList.add(node);
	          }
	          
	          
	          for(int j=0;j<nodeList.size();j++){
	        	  Node node=nodeList.get(j);
	        	  
	        	  if (node.getPid()<0) {
	        		  	System.out.println(node.getName()+",pid:"+node.getPid()+",id:"+node.getId());
	        		  	rList.add(node);
	        		  	sk.push(node);
	        		  		while (!sk.isEmpty()) {
	        		  			  int findC=-1;  //是否发现孩子 0:没有,n孩子的索引
									for (int i = 0; i < nodeList.size(); i++) {
												Node snode=nodeList.get(i);
												Node pNode=sk.peek();
												if (snode.getPid()==pNode.getId()&&!snode.ischeck) {
													snode.level=pNode.level+1;
													String space = "";
													for (int k = 0; k < snode.level; k++) {
														space+="	";
													}
												 	System.out.println(space+snode.getName()+",pid:"+snode.getPid()+",id:"+snode.getId());
												 	rList.add(snode);
												 	sk.push(snode);
												 	findC=i;
												 	snode.ischeck=true;
												 	break;
												}
									}
									if (findC<0) {
										sk.pop();
									}
								
							}
				  }
	          }
			
			
			
		}
}


