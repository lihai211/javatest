package com.meConcurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TestTheadPool {
	void testCoreSize(){
		
		Executors.newFixedThreadPool(nThreads)
			ThreadPoolExecutor  tpe= new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue)
	}
}
