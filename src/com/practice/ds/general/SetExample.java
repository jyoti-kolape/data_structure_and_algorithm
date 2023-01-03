package com.practice.ds.general;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Jyoti");
        Employee employee2 = employee1;
        Employee employee3 = new Employee(2, "Jyoti");
        Employee employee4 = new Employee(2, "Jyoti1");

        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        System.out.println(employeeSet.size());
        Iterator<Employee> namesIterator = employeeSet.iterator();
        while(namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

    }
}
