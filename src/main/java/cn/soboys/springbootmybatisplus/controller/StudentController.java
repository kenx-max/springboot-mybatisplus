package cn.soboys.springbootmybatisplus.controller;

import cn.soboys.springbootmybatisplus.PageRequest;
import cn.soboys.springbootmybatisplus.bean.Student;

import cn.soboys.springbootmybatisplus.service.IStudentService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author kenx
 * @version 1.0
 * @date 2021/6/25 11:09
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    /**
     * 添加学生
     *
     * @param student
     * @return
     */
    @PostMapping("/add")
    public boolean addStudent(@RequestBody Student student) {
        boolean flag = studentService.save(student);

        return flag;
    }

    /**
     * 根据id更新学生信息
     *
     * @param student
     * @return
     */
    @PutMapping("/update")
    public boolean updateStudent(@RequestBody Student student) {
        //根据学生id更新学生
        boolean flag = studentService.updateById(student);
        return flag;
    }


    /**
     * 查找所有学生信息
     *
     * @return
     */
    @GetMapping("/list")
    public List<Student> list() {
        return studentService.list();
    }

    /**
     * 根据id删除学生信息
     *
     * @param studentId
     * @return
     */
    @DeleteMapping("/del/{studentId}")
    public boolean del(@PathVariable long studentId) {
        boolean flag = studentService.removeById(studentId);
        return flag;
    }

    /**
     * 根据id获取学生信息
     *
     * @param studentId
     * @return
     */
    @GetMapping("{studentId}")
    public Student getStudentInfo(@PathVariable long studentId) {

        return studentService.getById(studentId);
    }

    /**
     * 获取学生详细信息
     *
     * @return
     */
    @GetMapping("listDetail")
    public List<Student> getStudentDetail() {
        return studentService.getStudentInfo();
    }


    /**
     * 分页获取学生详细信息
     *
     * @return
     */
    @GetMapping("listDetailPage")
    public IPage<Student> getStudentDetailPage(PageRequest request) {
        Page<Student> page = new Page<>();
        //设置每页显示几条
        page.setSize(request.getPageSize());
        //设置第几页
        page.setCurrent(request.getPageNum());
        return studentService.getStudentPage(page, 1);
    }


}
