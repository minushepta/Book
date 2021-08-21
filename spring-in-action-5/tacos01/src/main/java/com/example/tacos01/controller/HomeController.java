package com.example.tacos01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: HomeController
 * @Description: 主页控制器
 * @Author: TechRice
 * @Date: 2021/8/21 15:27
 */
@Controller    // @Controller 表现层、@Component 普通、@Repository 持久层、@Service 业务逻辑层
public class HomeController {
    /**
     * 处理客户端对 "/" 的 GET 请求，等效于 @RequestMapping(method=RequestMethod.GET)
     * @return 返回 home 视图
     */
    @GetMapping("/")
    public String home() {
        return "home";    // 返回视图名
    }
}
