package com.sbt.collections_api.examples;

import com.sbt.collections_api.Person;
import com.sbt.collections_api.PersonFirstLoad;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Example5_HashSet {
    public static void main(String[] args) {

        Set<Person> persons = new HashSet<>();
        System.out.println("-1.--------------------------------");

        // инициализируйте вызовом PersonFirstLoad.init()
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте состав и порядок элементов
        Set<Person> personHashSet = new HashSet<>();
        PersonFirstLoad p = new PersonFirstLoad();
        p.init(personHashSet);
        p.print(personHashSet);
    }
}
