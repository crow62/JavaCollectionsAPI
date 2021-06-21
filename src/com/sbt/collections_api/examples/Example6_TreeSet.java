package com.sbt.collections_api.examples;

import com.sbt.collections_api.Person;
import com.sbt.collections_api.PersonFirstLoad;

import java.util.*;

public class Example6_TreeSet {
    public static void main(String[] args) {

        System.out.println("-1.--------------------------------");
        // инициализируйте вызовом PersonFirstLoad.init()
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов

        Set<Person> personTreeSet = new TreeSet<>();
        PersonFirstLoad p = new PersonFirstLoad();
        p.init(personTreeSet);
        p.print(personTreeSet);

        System.out.println("-2.--------------------------------");
        // сформируйте новый объект TreeSet, с использованием внешнего Comparator,
        // который будет производить сортировку в обратном естественному порядке
        // инициализируйте вызовом PersonFirstLoad.init(persons)
        // последовательно извлеките все элементы из PriorityQueue и проанализируйте порядок извлечения

        Set<Person> personTreeSet1 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId()> o2.getId()) return -1;
                if (o1.getId()<o2.getId()) return 1;
                else return 0;
            }
        });
        p.init(personTreeSet1);
        p.print(personTreeSet1);

    }
}
