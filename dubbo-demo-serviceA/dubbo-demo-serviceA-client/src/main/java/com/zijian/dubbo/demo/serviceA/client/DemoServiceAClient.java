package com.zijian.dubbo.demo.serviceA.client;

import com.zijian.dubbo.demo.serviceA.api.DemoServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zijian on 8/22/14.
 */
@Component
public class DemoServiceAClient {

	@Autowired
	private DemoServiceA demoServiceA;

	public void hello(String name) {
		demoServiceA.hello(name);
	}
}
