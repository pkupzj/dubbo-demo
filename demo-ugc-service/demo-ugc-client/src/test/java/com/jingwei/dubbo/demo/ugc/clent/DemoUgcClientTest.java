package com.jingwei.dubbo.demo.ugc.clent;

import com.jingwei.dubbo.demo.ugc.client.DemoUgcClient;
import com.jingwei.rose.junit.RoseTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zijian on 8/22/14.
 */
public class DemoUgcClientTest extends RoseTestCase{
	@Autowired
	private DemoUgcClient demoUgcClient;

	@Test
	public void test(){
		demoUgcClient.helloUgcService("lily");
	}
}
