package com.zijian.dubbo.demo.serviceB.provider;

import com.zijian.dubbo.demo.serviceB.api.DemoServiceB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zijian on 8/22/14.
 */
public class DemoServiceBImpl implements DemoServiceB {

	private static final Logger LOG = LoggerFactory.getLogger(DemoServiceBImpl.class);

	@Override
	public String hello(String name) {
		String msg = "Hello " + name + ", This is demoServiceB";
		LOG.info(msg);
		return msg;
	}
}
