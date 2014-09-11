package com.zijian.dubbo.demo.serviceA.provider;

import com.zijian.dubbo.demo.serviceA.api.DemoServiceA;

/**
 * Created by zijian on 8/22/14.
 */
public class DemoServiceAImpl implements DemoServiceA {

	@Override
	public void hello(String name) {
		System.out.println("Hello, " + name +", This is demoServiceA");
	}
}
