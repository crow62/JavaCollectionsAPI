package com.sbt.collections_api.examples;

import com.sbt.collections_api.Person;
import com.sbt.collections_api.PersonFirstLoad;

import java.util.*;

public class Example9_Collections {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        System.out.println("-1.-------------------------------");
        // инициализируйте вызовом PersonFirstLoad.init()
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов

        List<Person> personArrayList = new ArrayList<>();
        PersonFirstLoad p = new PersonFirstLoad();
        p.init(personArrayList);
        p.print(personArrayList);

        System.out.println("-2.-------------------------------");
        // отсортируйте содержимое в естественном порядке вызовом Collections.sort(List)
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов

        Collections.sort(personArrayList);
        p.print(personArrayList);

        System.out.println("-3.-------------------------------");
        // обратите порядок клиентов вызовом Collections.reverse(List)
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов

        Collections.reverse(personArrayList);
        p.print(personArrayList);

        System.out.println("-4.-------------------------------");
        // отсортируйте содержимое по телефонным номерам вызовом Collections.sort(List, Comparator)
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов

        Collections.sort(personArrayList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (Long.parseLong(o1.getPhoneNumber()) > Long.parseLong(o2.getPhoneNumber())) return 1;
                else if (Long.parseLong(o1.getPhoneNumber()) < Long.parseLong(o2.getPhoneNumber())) return -1;
                else return 0;
            }
        });
        p.print(personArrayList);

        System.out.println("-5.-------------------------------");
        // выведите минимальный по естественному порядку элемент вызовом Collections.min(List)
        // и максимальный по индексу элемент вызовом Collections.max(List, Comparator)
        System.out.println(Collections.min(personArrayList));
        System.out.println(Collections.max(personArrayList));


    }
}
