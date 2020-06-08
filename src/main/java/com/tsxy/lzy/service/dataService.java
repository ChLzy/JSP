package com.tsxy.lzy.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tsxy.lzy.mapper.NoticeMapper;
import com.tsxy.lzy.pojo.AdminExample;
import com.tsxy.lzy.pojo.Notice;
import com.tsxy.lzy.pojo.NoticeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class dataService {
    @Autowired
    private NoticeMapper noticeMapper;

    /*增加公告*/
    public String addNotice(Notice notice){
        int i = noticeMapper.insert(notice);
        return "addNotice:添加成功";
    }
    /*所有公告*/
    public List<Notice> allNotice(){
        List<Notice> notices = noticeMapper.selectByExample(null);
        return notices;
    }
    /*分页*/
    public Map<String, Object> map(String title, int CurPage) {
        NoticeExample noticeExample = new NoticeExample();
        NoticeExample.Criteria criteria = noticeExample.createCriteria();
        criteria.andTitleLike("%" + title + "%");
        PageHelper.startPage(CurPage, 5);

        List<Notice> list = noticeMapper.selectByExample(noticeExample);
        PageInfo<Notice> pageInfo = new PageInfo<>(list);
        HashMap<String, Object> map = new HashMap<>();
        map.put("list", list);
        map.put("pageInfo", pageInfo);
        return map;
    }
    /*根据id查找公告*/
    public Notice selectNotice(Integer id){
        Notice notice1 = noticeMapper.selectByPrimaryKey(id);
        return notice1;
    }
    /*根据id删除公告*/
    public int delNotice(Integer id){
        int i = noticeMapper.deleteByPrimaryKey(id);
        return i;
    }
}
