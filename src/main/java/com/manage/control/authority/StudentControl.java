package com.manage.control.authority;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.manage.entity.Role;
import com.manage.entity.Student;
import com.manage.service.authority.RoleService;
import com.manage.service.authority.StudentService;
import com.manage.util.PageData;
import com.manage.util.PageParam;

@Controller
@RequestMapping("stu/")
public class StudentControl {

    @Autowired
    private StudentService studentService;
    
    /**
     * 得到所有的学生(管理人员)信息
     * 当classid不为空时为学生
     * 当classid为空时则为管理人员
     * @param pageParam 分页条件
     * @param kw  查询关键字
     * @param isClassesid classid是否为空 false为空
     * @return 符合查询条件的学生
     */
    @RequestMapping("getAllStu")
    @ResponseBody
    public PageData qeuryAll(PageParam pageParam, String kw,Boolean isClassesid) {
       return studentService.getPageDataForStu(pageParam, kw, isClassesid);
    }
    
    /**
     * 暂时没有用到
     * 得到所有的管理人员信息
     * @param pageParam 分页条件
     * @param kw  查询关键字
     * @return 符合查询条件的管理人员
     */
    @RequestMapping("getAllMgr")
    @ResponseBody
    public PageData qeuryAllMgr(PageParam pageParam, String kw) {
        return studentService.getPageData(pageParam, kw);
    }
    
    /**
     * 暂时没有用到
     * 查询此社团下的学生
     * @param id 社团的id
     * @return 符合条件的学生
     */
    @RequestMapping("getStusByCommid")
    @ResponseBody
    public List<Student> test(Integer id) {
        List<Student> list = studentService.getStudentByCommid(id);
        return list;
    }
    
    /**
     * 添加/修改 学生信息
     * 从前台传stu的属性值
     * 由Springmvc进行封装
     * 如果stu的stuid属性为空,则调用添加的方法
     * 如果stu的stuid属相不为空,则调用更新的方法
     * 
     * 前台参数有:
     *      stuName,stuNativePlace,stuBirthday,
     *      sutSex,classes.classesid,crid(communityRoleid)
     * 其他参数:
     *      stuid 在添加方法中为自增,
     *            在更新方法中作为条件
     *      stuPwd 默认为 '123123'
     * 
     * @param stu 学生对象
     * @param crid communiotyRoleid 社团角色对应的id
     * @throws Exception
     */
    @RequestMapping("saveStu")
    @ResponseBody
    public String saveStu(@ModelAttribute Student stu,Integer crid)
            throws Exception {
        if(stu.getStuid() == null){
            /**
             * 保存crid(communityRoleid)
             * 如果是添加管理人员则为
             * {@link com.manage.mapper.authority.CommunityRoleMapper#setRoleToStu(Integer,Integer)} 
             * 方法中社团角色的id
             */
            StudentService.crid = crid;
            studentService.save(stu);
            return "save is ok";
        } else {
            studentService.update(stu);
            return "update is ok";
        }
    }
    
    /**
     * 通过学生的id来删除学生信息
     * 要删除的学生id封装在list中
     * @param ids 需要删除的学生的id
     * 
     */
    @RequestMapping("deleteStu")
    @ResponseBody
    public String deleteStu(@RequestBody List<Integer> ids){
        studentService.delete(ids);
        return "ok";
    }
    
   
   

}
