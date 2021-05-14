package com.atguigu.eduService.controller;


import com.atguigu.eduService.entity.EduTeacher;
import com.atguigu.eduService.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author zhangjianxin
 * @since 2021-05-14
 */
@RestController
@RequestMapping("/eduService/teacher")
public class EduTeacherController {

    @Autowired
    EduTeacherService eduTeacherService;
    @GetMapping("/findAll")
    public List<EduTeacher> findAll(){
        List<EduTeacher> list = eduTeacherService.list(null);
        return list;
    }

    @DeleteMapping("delById/{id}")
    public boolean delById(@PathVariable("id") String id){
        boolean b = eduTeacherService.removeById(id);
        return b;
    }
}

