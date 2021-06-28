package cn.soboys.springbootmybatisplus.service;

import cn.soboys.springbootmybatisplus.bean.Student;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kenx
 * @version 1.0
 * @date 2021/6/25 10:59
 */

public interface IStudentService extends IService<Student> {
    List<Student> getStudentInfo();


    /**
     * 分页查询
     * @param page
     * @param gradeId 班级id
     * @return
     */
    IPage<Student> getStudentPage(Page<Student> page,long gradeId);
}
