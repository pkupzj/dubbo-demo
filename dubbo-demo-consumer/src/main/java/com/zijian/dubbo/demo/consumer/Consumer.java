package com.zijian.dubbo.demo.consumer;

import com.zijian.dubbo.demo.serviceA.client.DemoServiceAClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by zijian on 9/18/14.
 */
@Component
public class Consumer {
	@Autowired
	private DemoServiceAClient serviceAClient;

//	@Autowired
//	private DemoServiceBClient serviceBClient;

	public void helloServiceA() {
		serviceAClient.hello("consumer");
	}

//	public void helloServiceB() {
//		serviceBClient.hello("consumer");
//	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-serviceA-client.xml","applicationContext-demo-consumer.xml");
		Consumer consumer = context.getBean(Consumer.class);
		consumer.helloServiceA();
//		consumer.helloServiceB();
	}

}
