package com.zijian.dubbo.demo.serviceB.provider;

import com.zijian.dubbo.demo.serviceB.api.DemoServiceB;

/**
 * Created by zijian on 8/22/14.
 */
public class DemoServiceBImpl implements DemoServiceB {

	@Override
	public void hello(String name) {
		System.out.println("Hello, " + name +", This is demoServiceA");
	}
}
