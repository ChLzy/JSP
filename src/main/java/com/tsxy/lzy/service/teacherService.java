package com.tsxy.lzy.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsxy.lzy.mapper.TeacherMapper;
import com.tsxy.lzy.pojo.Teacher;
import com.tsxy.lzy.pojo.TeacherExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class teacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    //遍历teacher管理员
    public List<Teacher> teacherList() {
        List<Teacher> list = teacherMapper.selectByExample(null);
        return list;
    }

    //添加teacher管理员
    public String teacherAdd(Teacher teacher) {
        int i = teacherMapper.insert(teacher);
        if (i == 1) {
            return "添加成功";
        } else {
            return "添加失败";
        }

    }

    //删除teacher管理员
    public String teacherDel(Integer teaid) {
        System.out.println(teaid + "+del：我进来了");
        int i = teacherMapper.deleteByPrimaryKey(teaid);
        if (i == 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    //根据名字查询
    public Teacher getByteaname(String adname) {
        if (adname != null) {
            TeacherExample teacherExample = new TeacherExample();
            TeacherExample.Criteria criteria = teacherExample.createCriteria();
            criteria.andTeanameEqualTo(adname);
            List<Teacher> teachers = teacherMapper.selectByExample(teacherExample);
            if (teachers.size() == 0) {
                return null;
            } else {
                return teachers.get(0);
            }

        } else {
            return null;
        }
    }

    //查找teacher管理员
    public Teacher selectTeacher(int teaId) {
        Teacher tea = teacherMapper.selectByPrimaryKey(teaId);
        return tea;
    }

    //修改teacher管理员
    public String edit(Teacher teacher) {
        int i = teacherMapper.updateByPrimaryKey(teacher);
        if (i == 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    //分页
    public Map<String, Object> map(String teaname, int CurPage) {
        TeacherExample teacherExample = new TeacherExample();
        TeacherExample.Criteria criteria = teacherExample.createCriteria();
        criteria.andTeanameLike("%" + teaname + "%");
        PageHelper.startPage(CurPage, 5);

        List<Teacher> list = teacherMapper.selectByExample(teacherExample);
        PageInfo<Teacher> pageInfo = new PageInfo<>(list);
        HashMap<String, Object> map = new HashMap<>();
        map.put("list", list);
        map.put("pageInfo", pageInfo);
        return map;
    }
}
