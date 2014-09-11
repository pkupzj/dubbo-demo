package com.zijian.dubbo.demo.serviceA.client;

import com.zijian.dubbo.demo.serviceA.api.DemoServiceA;

/**
 * Created by zijian on 8/22/14.
 */

public class DemoServiceAClient {

	private DemoServiceA demoServiceA = ServiceManager.getInstance().getDemoServiceA();

	private static DemoServiceAClient instance = new DemoServiceAClient();

	public static DemoServiceAClient getInstance() {
		return instance;
	}

	public void helloUgcService(String name){
		demoServiceA.hello(name);
	}

}
