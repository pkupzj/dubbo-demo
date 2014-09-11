package com.jingwei.dubbo.demo.ugc.clent;

import com.zijian.dubbo.demo.serviceA.client.DemoServiceAClient;
import org.junit.Test;

/**
 * Created by zijian on 8/22/14.
 */
public class DemoUgcClientTest{

	private DemoServiceAClient demoServiceAClient = DemoServiceAClient.getInstance();

	@Test
	public void test(){
		demoServiceAClient.helloUgcService("lily");
	}
}
