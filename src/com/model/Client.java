package com.model;  
  
import java.lang.reflect.ParameterizedType; 
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
import org.hibernate.annotations.*;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

class parant<T> {
		public  parant(){
		     System.out.println("parant1:"+getClass());
		 	Class c = getClass();
		 	Type t = c.getGenericSuperclass();
	    	Type[] p = ((ParameterizedType)t).getActualTypeArguments();
		 	 System.out.println("parant2:"+t);
		}
}
class Box<M>  extends parant<String> {

    private M data;

    public Box()  {
        System.out.println(getClass());
    }

    public Box(M data) {
    	System.out.println("Box:"+getClass());

        this.data = data;
    }

    public M getData() {
        return data;
    }

}
  
public class Client {  
  
    public static void main(String[] args) {  
          
        //读取hibernate.cfg.xml文件  
      //  Configuration cfg = new Configuration().configure();  
        
       //读取注解
        Configuration cfg2 = new AnnotationConfiguration();
        cfg2.configure();
        //建立SessionFactory  
        SessionFactory factory = cfg2.buildSessionFactory();  
          
        //取得session  
        Session session = null;  
        try {  
            session = factory.openSession();  
            //开启事务  
            session.beginTransaction();  
            Student user = new Student();  
            user.setId(117);
           user.setAge(128);  
          //  user.setName("s3xx2x");
          //  session.update(user);  //这方法很sb,会更新所有字段
          //  session.merge(user); //这方页法很sb,会更新所有字段
   
           // Query query=session.createSQLQuery(" update student set name='手动生气了'   where id=117");
            //query.executeUpdate();
           Query query =session.createQuery("from Student where age=14");
           
           Student st=(Student)query.list().get(0);
        
 
            //插入User对象  
           // session.save(user);  
          //  session.delete(user);
            
            
          
//     
       //     Query query = 
            	//	session.createSQLQuery("select s.name as vaue ,c.name as value1  FROM student s LEFT JOIN sc  ON sc.stId= s.id LEFT JOIN class c ON c.atno=sc.classid  LIMIT 0,2 ");
            		//session.createSQLQuery("select  s.age , s.name ,sc.stId,c.name   from student  s  LEFT JOIN sc  ON sc.stId= s.id  LEFT JOIN class c  ON c.atno=sc.classid    LIMIT 0,2");
            		//List list=query.list();
            		//session.createQuery("select new Student(id) from Student");  //hql 查出id列
            		
            		//sql查询指定列,也可以解决字段重名问题，obj返回
//            		session.createSQLQuery("select  s.* ,sc.* ,c.name  from student  s  LEFT JOIN sc  ON sc.stId= s.id  LEFT JOIN class c  ON c.atno=sc.classid    LIMIT 0,2")
//            		.addScalar("c.name", Hibernate.STRING)
//                    .addScalar("s.name", Hibernate.STRING)
//                    .addScalar("s.id");
            		
            		
            		//session.createSQLQuery("select  s.* ,sc.* ,c.name  from student  s  LEFT JOIN sc  ON sc.stId= s.id  LEFT JOIN class c  ON c.atno=sc.classid    LIMIT 0,2")
//            		session.createSQLQuery("select {s.*},c.name  FROM student s LEFT JOIN sc  ON sc.stId= s.id LEFT JOIN class c ON c.atno=sc.classid  LIMIT 0,2 ")
//            	   
//            		.addEntity("s",Student.class).addScalar("c.name")
            
            		;
           // List list=query.list();
    		
            		
            		
         //  System.out.println(list);
            
              
            //提交事务  
            session.getTransaction().commit();  
        }catch(Exception e) {  
            e.printStackTrace();  
            //回滚事务  
            session.getTransaction().rollback();  
        }finally {  
            if (session != null) {  
                if (session.isOpen()) {  
                    //关闭session  
                    session.close();  
                }  
            }  
        }  
    }  
} 