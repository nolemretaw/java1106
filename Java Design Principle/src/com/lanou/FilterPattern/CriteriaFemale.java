package com.lanou.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HuTingrong
 * @Description: 3
 * @Date: Created in 14:18 2019/11/1
 * @Modified By:
 */
public class CriteriaFemale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("female")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
