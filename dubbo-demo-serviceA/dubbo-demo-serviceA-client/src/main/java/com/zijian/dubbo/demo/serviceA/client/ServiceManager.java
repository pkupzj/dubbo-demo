package com.zijian.dubbo.demo.serviceA.client;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.MonitorConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.utils.ReferenceConfigCache;
import com.zijian.dubbo.demo.serviceA.api.DemoServiceA;

public class ServiceManager {

    private DemoServiceA demoServiceA;


    private static ServiceManager instance = new ServiceManager();

    public static ServiceManager getInstance() {
        return instance;
    }

    private ServiceManager() {
        init();
    }

    private void init() {
        // 当前应用配置
        ApplicationConfig application = new ApplicationConfig();
        application.setName("demo-ugc-service-client");
        application.setOwner("zijian.pan");
        application.setOrganization("jingwei.com");
        // 监控中心配置
        MonitorConfig monitorConfig = new MonitorConfig();
        monitorConfig.setProtocol("registry");
        application.setMonitor(monitorConfig);
        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setProtocol("zookeeper");
        registry.setAddress("zookeeper1:2181,zookeeper2:2181,zookeeper3:2181");
        registry.setCheck(false);
		registry.setFile("demo-ugc-service-client-cache.properties");

        // cache对象
        ReferenceConfigCache cache = ReferenceConfigCache.getCache();
        // 引用远程服务
        ReferenceConfig<DemoServiceA> reference1 = new ReferenceConfig<DemoServiceA>(); // 此实例很重，封装了与注册中心的连接以及与提供者的连接，请自行缓存，否则可能造成内存和连接泄漏
        reference1.setApplication(application);
        reference1.setRegistry(registry);
        reference1.setInterface(DemoServiceA.class);
        reference1.setCheck(false);
        reference1.setVersion("1.0.0");
		demoServiceA = cache.get(reference1);

    }

	public DemoServiceA getDemoServiceA() {
		return demoServiceA;
	}
}
