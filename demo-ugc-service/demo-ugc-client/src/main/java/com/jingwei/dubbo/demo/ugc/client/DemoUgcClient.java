package com.jingwei.dubbo.demo.ugc.client;

import com.jingwei.dubbo.demo.ugc.api.DemoUgcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zijian on 8/22/14.
 */

@Component
public class DemoUgcClient {
	@Autowired
	private DemoUgcService demoUgcService = ServiceManager.getInstance().getDemoUgcService();

	public void helloUgcService(String name){
		demoUgcService.hello(name);
	}

}
