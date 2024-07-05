package com.xvecheng.content.service;

import com.xvecheng.base.model.PageParams;
import com.xvecheng.base.model.PageResult;
import com.xvecheng.content.model.dto.QueryCourseParamsDto;
import com.xvecheng.content.model.po.CourseBase;

/**
 *
 */
public interface CourseBaseInfoService {
    //课程分页查询
    public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto courseParamsDto);


}
