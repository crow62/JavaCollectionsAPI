package com.sbt.collections_api.examples;

import com.sbt.collections_api.Person;
import com.sbt.collections_api.PersonFirstLoad;
import com.sbt.collections_api.Segment;

import java.util.*;

public class Example10_UnmodifiableCollections {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        System.out.println("-1.-------------------------------");
        // инициализируйте вызовом PersonFirstLoad.init()
        // сформируйте немодифицируемую коллекцию вызовом Collections.unmodifiableCollection
        // попробуйте добавить нового клиента new Person(10L, "Бирюков Виктор Валерьевич", "79185551234", Segment.MASS)
        // проанализируйте вывод в консоли
        List<Person> personArrayList = new ArrayList<>();
        PersonFirstLoad p = new PersonFirstLoad();
        p.init(personArrayList);
        Collection<Person> people = Collections.unmodifiableCollection(personArrayList);
        people.add(new Person(10L, "Бирюков Виктор Валерьевич", "79185551234", Segment.MASS));
    }
}
