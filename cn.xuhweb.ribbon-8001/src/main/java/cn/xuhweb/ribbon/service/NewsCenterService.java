package cn.xuhweb.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xuh
 * DATE 2018/12/11 21:39.
 * version 1.0
 */
@Configuration
public class NewsCenterService {

    @Autowired
    private RestTemplate restTemplate;

    public String newsGet(String name){
        return restTemplate.getForObject("http://new-center/news/get?name=" + name, String.class);
    }

}
