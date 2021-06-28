package cn.soboys.springbootmybatisplus.service.impl;

import cn.soboys.springbootmybatisplus.bean.Student;
import cn.soboys.springbootmybatisplus.mapper.StudentMapper;
import cn.soboys.springbootmybatisplus.service.IStudentService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kenx
 * @version 1.0
 * @date 2021/6/25 13:35
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {
    @Override
    public List<Student> getStudentInfo() {
        return this.baseMapper.findStudentInfo();
    }

    @Override
    public IPage<Student> getStudentPage(Page<Student> page,long gradeId) {
        // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题，这时候你需要自己查询 count 部分
        // page.setOptimizeCountSql(false);
        // 当 total 为小于 0 或者设置 setSearchCount(false) 分页插件不会进行 count 查询
        // 要点!! 分页返回的对象与传入的对象是同一个

        return this.baseMapper.findStudentPage(page,gradeId);
    }
}
