package com.xvecheng.content.api;

import com.xvecheng.base.model.PageParams;
import com.xvecheng.base.model.PageResult;
import com.xvecheng.content.model.dto.QueryCourseParamsDto;
import com.xvecheng.content.model.po.CourseBase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Api(value = "课程信息编辑接口",tags = "课程信息编辑接口")
@RestController //相当于controller 和 responseBody的整合
public class CourseBaseInfoController {

    //@PostMapping
    //@RequestMapping("/course/list")
    @ApiOperation("课程查询接口")
    @PostMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto){


        CourseBase courseBase = new CourseBase();
        courseBase.setName("测试名称");
        courseBase.setCreateDate(LocalDateTime.now());
        List<CourseBase> courseBases = new ArrayList();
        courseBases.add(courseBase);
        PageResult pageResult = new PageResult<CourseBase>(courseBases,10,1,10);
        return pageResult;

    }

}
