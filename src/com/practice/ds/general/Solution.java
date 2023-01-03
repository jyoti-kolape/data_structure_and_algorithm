package com.practice.ds.general;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Jyoti");
        Employee emp2 = new Employee(1, "Jyoti123");
        Employee emp3 = new Employee(2, "Babli");
        Employee emp4 = new Employee(3, "Namrata");
        Employee emp5 = new Employee(4, "Wifi");
        HashMap<Employee, String> map = new HashMap<>();

        List<Employee> list = new ArrayList<>(Arrays.asList(emp1, emp2, emp3, emp4, emp5));

        map.put(emp1, "Jyoti");
        map.put(emp2, "Jyoti");
        map.put(emp3, "Babli");
        map.put(emp4, "Namrata");
        map.put(emp5, "Wifi");

        System.out.println(map);

        for (Map.Entry<Employee, String> entry : map.entrySet()) {
            Employee key = entry.getKey();
            String value = entry.getValue();
            System.out.println("<" + key.getId() + "-" + key.getName() + "> " + "-> " + value);
        }

        Set<Employee> set = new HashSet<>();
        set.add(emp1);
        set.add(emp2);
        set.add(emp3);
        set.add(emp4);
        set.add(emp5);
        System.out.println();

        /*for (Employee employee : set) {
            System.out.println("<" + employee.getId() + "-" + employee.getName() + "> ");
            set.remove(employee);
        }*/

        /*for (int i = 0; i < list.size(); i++) {
            Employee employee = list.get(i);
            System.out.println(employee.getId() + " " + employee.getName());
            list.remove(employee);
        }*/

        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee next = iterator.next();
            System.out.println(next.getId() + " " + next.getName());
            list.remove(next);
        }

    }
}
