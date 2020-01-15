package com.dubbo.provider.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Value("${server.port}")
    private String port;

    @Override
    public String sayHello(String name) {
        return "providerPort:"+port+",content:" + name;
    }
}
