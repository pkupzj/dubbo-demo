package com.zijian.dubbo.demo.serviceA.provider;

import com.zijian.dubbo.demo.serviceA.api.DemoServiceA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zijian on 8/22/14.
 */
public class DemoServiceAImpl implements DemoServiceA {

	private static final Logger LOG = LoggerFactory.getLogger(DemoServiceAImpl.class);

	@Override
	public String hello(String name) {
		String msg = "Hello " + name + ", This is demoServiceA";
		LOG.info(msg);
		return msg;
	}
}
