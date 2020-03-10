package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.*.*.dao")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ   启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "            疯狂源于梦想       \n" +
                "            技术成就辉煌       \n" +
                "            好学习 更快乐       \n" +
                " http://www.edu.gov.cn \n" +
                "--------------------------------------" +
                "啦啦啦啦啦  ");

    }

}
