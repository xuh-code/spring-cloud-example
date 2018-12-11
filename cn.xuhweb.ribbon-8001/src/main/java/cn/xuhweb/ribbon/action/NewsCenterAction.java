package cn.xuhweb.ribbon.action;

import cn.xuhweb.ribbon.service.NewsCenterService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by xuh
 * DATE 2018/12/11 21:35.
 * version 1.0
 */
@RestController
public class NewsCenterAction {

    @Resource
    private NewsCenterService newsCenterService;

    @RequestMapping(value = "/news/get")
    @ResponseBody
    public String home(@RequestParam(value = "name") String name) {
        return this.newsCenterService.newsGet(name);
    }

}
