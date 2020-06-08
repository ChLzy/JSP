package com.tsxy.lzy.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsxy.lzy.mapper.AdminMapper;
import com.tsxy.lzy.pojo.Admin;
import com.tsxy.lzy.pojo.AdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class adminService {
    @Autowired
    private AdminMapper adminMapper;

    //遍历admin管理员
    public List<Admin> adminList() {
        List<Admin> list = adminMapper.selectByExample(null);
        return list;
    }

    //添加admin管理员
    public String adminAdd(Admin admin) {
        int i = adminMapper.insert(admin);
        if (i == 1) {
            return "添加成功";
        } else {
            return "添加失败";
        }

    }

    //删除admin管理员
    public String adminDel(Integer AdId) {
        System.out.println(AdId + "+del：我进来了");
        int i = adminMapper.deleteByPrimaryKey(AdId);
        if (i == 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    //根据名字查询
    public Admin getByadname(String adname) {
        if (adname != null) {
            AdminExample adminExample = new AdminExample();
            AdminExample.Criteria criteria = adminExample.createCriteria();
            criteria.andAdnameEqualTo(adname);
            List<Admin> admins = adminMapper.selectByExample(adminExample);
            if (admins.size() == 0) {
                return null;
            } else {
                return admins.get(0);
            }

        } else {
            return null;
        }
    }

    //查找admin管理员
    public Admin selectAdmin(int AdId) {
        Admin a = adminMapper.selectByPrimaryKey(AdId);
        return a;
    }

    //修改admin管理员
    public String edit(Admin admin) {
        int i = adminMapper.updateByPrimaryKey(admin);
        if (i == 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    //分页
    public Map<String, Object> map(String adname, int CurPage) {
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdnameLike("%" + adname + "%");
        PageHelper.startPage(CurPage, 5);

        List<Admin> list = adminMapper.selectByExample(adminExample);
        PageInfo<Admin> pageInfo = new PageInfo<>(list);
        HashMap<String, Object> map = new HashMap<>();
        map.put("list", list);
        map.put("pageInfo", pageInfo);
        return map;
    }
}
