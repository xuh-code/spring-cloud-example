package cn.xuhweb.feign.feign9000.action;

import cn.xuhweb.feign.feign9000.service.NewsCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by xuh
 * DATE 2018/12/11 21:35.
 * version 1.0
 */
@RestController
public class NewsCenterAction {

    @Autowired
    private NewsCenterService newsCenterService;

    @RequestMapping(value = "/feign-hi", method = RequestMethod.GET)
    @ResponseBody
    public String sayHi(@RequestParam("name") String name) {
        return this.newsCenterService.newsCenterFromFeignClient(name);
    }

}
