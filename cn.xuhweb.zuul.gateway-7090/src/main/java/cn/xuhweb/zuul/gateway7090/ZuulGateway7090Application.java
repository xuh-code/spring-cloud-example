package cn.xuhweb.zuul.gateway7090;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ZuulGateway7090Application {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway7090Application.class, args);
    }
}
