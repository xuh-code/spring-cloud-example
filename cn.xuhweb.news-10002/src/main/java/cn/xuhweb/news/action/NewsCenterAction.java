package cn.xuhweb.news.action;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xuh
 * DATE 2018/12/11 1:11.
 * version 1.0
 */
@RestController
@RequestMapping("/news")
public class NewsCenterAction {

    @Value("${server.port}")
    String port;

    @RequestMapping("/get")
    @ResponseBody
    public String home(@RequestParam(value = "name") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

}
