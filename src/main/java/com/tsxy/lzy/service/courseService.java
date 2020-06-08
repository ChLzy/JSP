package com.tsxy.lzy.service;

import com.tsxy.lzy.mapper.CourseMapper;
import com.tsxy.lzy.mapper.TvMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("courseService")
public class courseService {
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private TvMapper tvMapper;

}
