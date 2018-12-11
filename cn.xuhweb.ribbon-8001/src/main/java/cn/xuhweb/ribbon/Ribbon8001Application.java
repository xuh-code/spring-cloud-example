package cn.xuhweb.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 服务提供者
public class Ribbon8001Application {

    public static void main(String[] args) {
        SpringApplication.run(Ribbon8001Application.class, args);
    }
}
