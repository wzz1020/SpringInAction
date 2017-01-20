package com.fengdui.chapter_10_rpc.springRMI;

import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * @author FD
 * @date 2017/1/20
 */
public class Test {
    public static void main(String[] args) {

        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:8888/hello");
        rmiProxyFactoryBean.setServiceInterface(HelloService.class);
        rmiProxyFactoryBean.setCacheStub(true);
        rmiProxyFactoryBean.setLookupStubOnStartup(true);
        rmiProxyFactoryBean.setRefreshStubOnConnectFailure(true);
        rmiProxyFactoryBean.afterPropertiesSet();
        rmiProxyFactoryBean.getObject();
    }
}
