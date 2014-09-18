package com.zijian.dubbo.demo.consumer;

import com.zijian.dubbo.demo.serviceA.client.DemoServiceAClient;
import com.zijian.dubbo.demo.serviceB.client.DemoServiceBClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by zijian on 9/18/14.
 */
@Component
public class Consumer {

	private static final Logger LOG = LoggerFactory.getLogger(Consumer.class);

	@Autowired
	private DemoServiceAClient serviceAClient;

	@Autowired
	private DemoServiceBClient serviceBClient;

	public String helloServiceA() {
		return serviceAClient.hello("consumer");
	}

	public String helloServiceB() {
		return serviceBClient.hello("consumer");
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-serviceA-client.xml"
		,"applicationContext-serviceB-client.xml","applicationContext-demo-consumer.xml");
		Consumer consumer = context.getBean(Consumer.class);
		LOG.info(consumer.helloServiceA());
		LOG.info(consumer.helloServiceB());
	}

}
