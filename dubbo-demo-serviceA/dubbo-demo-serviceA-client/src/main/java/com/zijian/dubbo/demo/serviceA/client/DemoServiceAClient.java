package com.zijian.dubbo.demo.serviceA.client;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zijian.dubbo.demo.serviceA.api.DemoServiceA;
import org.springframework.stereotype.Component;

/**
 * Created by zijian on 8/22/14.
 */
@Component
public class DemoServiceAClient {

	@Reference(version = "1.0.0")
	private DemoServiceA demoServiceA;

	public String hello(String name) {
		return demoServiceA.hello(name);
	}
}
