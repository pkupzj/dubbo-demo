package com.jingwei.dubbo.demo.ugc.provider;

import com.jingwei.dubbo.demo.ugc.api.DemoUgcService;

/**
 * Created by zijian on 8/22/14.
 */
public class DemoUgcServiceImpl implements DemoUgcService {

	@Override
	public void hello(String name) {
		System.out.println("Hello, " + name +", This is demoUgcService");
	}
}
