package cn.xuhweb.feign.feign9000.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xuh
 * DATE 2018/12/11 23:02.
 * version 1.0
 */
@FeignClient(value = "NEW-CENTER")
public interface NewsCenterService {


    @RequestMapping(value = "/news/get", method = RequestMethod.GET)
    String newsCenterFromFeignClient(@RequestParam("name") String name);

}
