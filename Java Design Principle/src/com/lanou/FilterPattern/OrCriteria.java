package com.lanou.FilterPattern;

import java.util.List;

/**
 * @Author: HuTingrong
 * @Description: 3
 * @Date: Created in 14:18 2019/11/1
 * @Modified By:
 */
public class OrCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(personList);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(personList);

        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
