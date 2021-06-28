package cn.soboys.springbootmybatisplus.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;


/**
 * @author kenx
 * @version 1.0
 * @date 2021/6/25 10:08
 */

@TableName
@Data
public class Student extends Model {
    @TableId(type = IdType.AUTO)
    private Long studentId;
    private String studentName;
    private int age;
    private String phone;
    private String addr;
    @TableField(exist = false)
    private String gradeName;
}
