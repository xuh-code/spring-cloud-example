package cn.xuhweb.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 服务提供者
public class NewsCenter10001Application {

    public static void main(String[] args) {
        SpringApplication.run(NewsCenter10001Application.class, args);
    }
}
