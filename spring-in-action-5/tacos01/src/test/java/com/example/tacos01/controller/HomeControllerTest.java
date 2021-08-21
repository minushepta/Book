package com.example.tacos01.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * @ClassName: HomeControllerTest
 * @Description: 测试主页控制器
 * @Author: TechRice
 * @Date: 2021/8/21 15:41
 */
@WebMvcTest(HomeController.class)    // 针对 HomeController 的 Web 测试
public class HomeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/"))    // 对 "/" 发起 GET 请求
                .andExpect(status().isOk())    // 期望得到 HTTP 200
                .andExpect(view().name("home"))    // 期望得到 home 视图
                .andExpect(content().string(containsString("Welcome to...")));    // 期望包含 "Welcome to..."
    }
}
