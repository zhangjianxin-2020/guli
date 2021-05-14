package com.atguigu.eduService.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author zhangjianxin
 * Date on 2021/5/14  16:28
 * @Description:
 */
@Configuration
@MapperScan("com.atguigu.eduService.mapper")
public class EduConfig {
}
