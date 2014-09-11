package com.jingwei.dubbo.demo.feed.provider;

import com.jingwei.dubbo.demo.feed.api.DemoFeedService;

/**
 * Created by zijian on 8/22/14.
 */
public class DemoFeedServiceImpl implements DemoFeedService {

	@Override
	public void hello(String name) {
		System.out.println("Hello, " + name + ", This is demoFeedService");
	}
}
