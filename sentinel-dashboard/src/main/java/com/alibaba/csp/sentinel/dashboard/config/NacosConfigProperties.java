package com.alibaba.csp.sentinel.dashboard.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zrhong
 * @version 1.0
 * @date 2020/9/7 17:59
 * @description
 */
@Component
@ConfigurationProperties(prefix = "nacos.server")
public class NacosConfigProperties {

    private String ip;

    private String port;

    private String namespace;

    private String groupId;

    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getPort() {
        return port;
    }
    public void setPort(String port) {
        this.port = port;
    }
    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    public String getGroupId() {
        return groupId;
    }
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    public String getServerAddr() {
        return this.getIp()+":"+this.getPort();
    }
    @Override
    public String toString() {
        return "NacosConfigProperties [ip=" + ip + ", port=" + port + ", namespace="
                + namespace + ", groupId=" + groupId + "]";
    }

}
