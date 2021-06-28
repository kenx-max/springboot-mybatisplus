package cn.soboys.springbootmybatisplus;

import lombok.Data;

import java.io.Serializable;

/**
 * @author kenx
 * @version 1.0
 * @date 2021/6/28 10:41
 * 分页查询
 */
@Data
public class PageRequest implements Serializable {
    private static final long serialVersionUID = -4869594085374385813L;

    /**
     * 当前页面数据量
     */
    private int pageSize = 10;

    /**
     * 当前页码
     */
    private int pageNum = 1;

    /**
     * 排序字段
     */
    private String field;

    /**
     * 排序规则，asc升序，desc降序
     */
    private String order;
}
