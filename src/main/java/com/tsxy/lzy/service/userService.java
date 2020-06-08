package com.tsxy.lzy.service;

import com.tsxy.lzy.mapper.EveryoneMapper;
import com.tsxy.lzy.mapper.StudentMapper;
import com.tsxy.lzy.mapper.TeacherMapper;
import com.tsxy.lzy.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class userService {
    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    EveryoneMapper everyoneMapper;
    //根据账号，查找教师
    public Teacher selectTea(String account){
        TeacherExample teacherExample=new TeacherExample();
        teacherExample.createCriteria().andTeamailEqualTo(account);
        List<Teacher> teachers = teacherMapper.selectByExample(teacherExample);
        return teachers.get(0);
    }
    //根据账号，查找学生
    public Student selectStu(String account){
        StudentExample studentExample=new StudentExample();
        studentExample.createCriteria().andStumailEqualTo(account);
        List<Student> students = studentMapper.selectByExample(studentExample);
        return students.get(0);
    }
    //查找某人账号是否存在
    public Everyone selectOne(String account){
      //  System.out.println("ccccc"+account);
        Everyone everyone = everyoneMapper.selectByPrimaryKey(account);
            return everyone;
    }

    //注册用户账号
    public int newAccount(Everyone everyone){
        int i = everyoneMapper.insert(everyone);
        return i;
    }
    //添加学生
    public int newStu(Student student){
        int i = studentMapper.insert(student);
        return i;
    }
    //添加教师
    public int newTea(Teacher teacher){
        int i = teacherMapper.insert(teacher);
        return i;
    }
    //修改学生信息
    public int stuUpdate(Student student) {
        System.out.println(student.toString());
        int i = studentMapper.updateByPrimaryKey(student);
        return i;
    }
}
