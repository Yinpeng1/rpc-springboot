//package com.yp.rpc.provider.config;
//
//import com.xxx.rpc.registry.zookeeper.ZooKeeperServiceRegistry;
//import com.xxx.rpc.server.RpcServer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RpcZKConfig {
//
//    @Value("${zkAddress}")
//    private String zkAddress;
//
//    @Value("${serviceAddress}")
//    private String serviceAddress;
//
//    @Autowired
//    private ZooKeeperServiceRegistry zooKeeperServiceRegistry;
//
//    @Bean(name = "zkConfig")
//    public ZooKeeperServiceRegistry init(){
//        ZooKeeperServiceRegistry zooKeeperServiceDiscovery = new ZooKeeperServiceRegistry(zkAddress);
//        return zooKeeperServiceDiscovery;
//    }
//
//    @Bean
//    public RpcServer initServer(){
//        RpcServer rpcServer = new RpcServer(serviceAddress, zooKeeperServiceRegistry);
//        return rpcServer;
//    }
//}
