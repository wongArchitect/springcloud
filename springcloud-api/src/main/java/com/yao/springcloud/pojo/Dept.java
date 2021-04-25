package com.yao.springcloud.pojo;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * dept
 * @author 
 */
@Data
@NoArgsConstructor
@Accessors(chain = true) //链式写法,写了这个注解也就是可以用链式的方式来写了
public class Dept implements Serializable { //实体类,orm对象关系映射，类表关系映射
    private Long deptno;
    private String dname;
    //这个数据存在那个数据库的字段，因为微服务是一个服务对应于一个数据库，同一个信息可能存在不同的数据库
    private String db_source;

    //构造器我们这里只需要一个就够了
    public Dept(String dname) {
        this.dname = dname;
    }

    /*
    链式写法：
        Dept dept = new Dept();
        dept.setDeptNo(11)
            .setDname('222')
            .setDb_source('001')
     */
}