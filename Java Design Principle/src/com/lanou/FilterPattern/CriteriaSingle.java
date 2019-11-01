package com.lanou.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HuTingrong
 * @Description: 3
 * @Date: Created in 14:18 2019/11/1
 * @Modified By:
 */
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getMaritalStatus().equalsIgnoreCase("Single")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
