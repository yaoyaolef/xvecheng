package com.xvecheng.content.api;

import com.xvecheng.content.model.dto.CourseCategoryTreeDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 课程分类相关接口
 */

@RestController
public class CourseCategoryController {

    @GetMapping("/course-category/tree-nodes")
    public CourseCategoryTreeDto queryTreeNodes(){
        return null;
    }
}
