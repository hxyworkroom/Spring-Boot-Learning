package cn.hy.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RestController:@RestController的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
@SpringBootApplication//此注解可以代替上面三个注解
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
    //在页面输出一个helloworld

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
