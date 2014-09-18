package com.zijian.dubbo.demo.serviceB.client;

import com.zijian.dubbo.demo.serviceB.api.DemoServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zijian on 8/22/14.
 */
@Component
public class DemoServiceBClient {

	@Autowired
	private DemoServiceB demoServiceB;

	public void hello(String name) {
		demoServiceB.hello(name);
	}
}
