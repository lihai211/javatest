package com.model; 

import com.sun.jndi.url.corbaname.corbanameURLContextFactory; 

public class Circle {
	double radius=0;
	public  Circle(double radius){
		this.radius=radius;
	}
	//内部类
	 class  Draw{
		public void drawShap(){
			System.out.println("drawshap"+radius);
		}
	}
	
	public static void main(String[] args) {
		Circle c=new Circle(500);
		Circle.Draw cd=c.new Draw();
		cd.drawShap();
	}
}
