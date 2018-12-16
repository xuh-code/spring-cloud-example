package cn.xuhweb.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@EnableDiscoveryClient
//@ComponentScan(basePackages = {"com.github.pig.admin", "com.github.pig.common.bean"})
public class UserCenter7070Application {

    public static void main(String[] args) {
        SpringApplication.run(UserCenter7070Application.class, args);
    }

}

