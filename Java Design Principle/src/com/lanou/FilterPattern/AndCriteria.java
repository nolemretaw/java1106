package com.lanou.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HuTingrong
 * @Description: 3 用来AND的过滤器
 * @Date: Created in 14:18 2019/11/1
 * @Modified By:
 */
public class AndCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> fisrtCriteriaPersons = criteria.meetCriteria(personList);
        return otherCriteria.meetCriteria(fisrtCriteriaPersons);
    }
}
