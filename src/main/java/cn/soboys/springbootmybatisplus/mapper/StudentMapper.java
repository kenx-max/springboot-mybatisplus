package cn.soboys.springbootmybatisplus.mapper;

import cn.soboys.springbootmybatisplus.bean.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;


/**
 * @author kenx
 * @version 1.0
 * @date 2021/6/25 10:53
 */
public interface StudentMapper extends BaseMapper<Student> {

    //查询学生信息
    List<Student> findStudentInfo();


    /**
     * 分页查询每个班级学生信息
     * @param page 分页对象,xml中可以从里面进行取值,传递参数 Page 即自动分页,必须放在第一位(你可以继承Page实现自己的分页对象)
     * @param gradeId 班级id
     * @return 分页对象
     */
    IPage<Student> findStudentPage(Page<?> page, long gradeId);


}
