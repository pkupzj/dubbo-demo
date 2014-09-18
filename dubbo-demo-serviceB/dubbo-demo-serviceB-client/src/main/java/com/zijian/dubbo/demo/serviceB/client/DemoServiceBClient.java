package com.zijian.dubbo.demo.serviceB.client;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zijian.dubbo.demo.serviceB.api.DemoServiceB;
import org.springframework.stereotype.Component;

/**
 * Created by zijian on 8/22/14.
 */
@Component
public class DemoServiceBClient {

	@Reference(version = "1.0.0")
	private DemoServiceB demoServiceB;

	public String hello(String name) {
		return demoServiceB.hello(name);
	}
}
