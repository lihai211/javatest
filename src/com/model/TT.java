package com.model;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;



public class TT {
public static void main(String[] args) {
	String url=TT.class.getResource("").getPath();  
    System.out.println(url);  
    File file = new File(url);  
    String licensecode = null;
	try {
		licensecode = FileUtils.readFileToString(file);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println(licensecode);  
}

}
