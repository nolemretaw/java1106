package com.lanou.FilterPattern;

import java.util.List;

/**
 * @Author: HuTingrong
 * @Description: 2、为标准（Criteria）创建一个接口
 * @Date: Created in 14:16 2019/11/1
 * @Modified By:
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> personList);
}
