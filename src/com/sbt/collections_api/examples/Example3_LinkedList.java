package com.sbt.collections_api.examples;

import com.sbt.collections_api.Person;
import com.sbt.collections_api.PersonFirstLoad;
import com.sbt.collections_api.Segment;

import java.util.LinkedList;
import java.util.List;

public class Example3_LinkedList {
    public static void main(String[] args) {

        System.out.println("-1.-------------------------------");
        // инициализируйте вызовом PersonFirstLoad.init()
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов

        LinkedList<Person> personLinkedList = new LinkedList<>();
        PersonFirstLoad p = new PersonFirstLoad();
        p.init(personLinkedList);
        p.print(personLinkedList);

        System.out.println("-2.-------------------------------");
        // выведите элемент LinkedList с индексом 5
        System.out.println(personLinkedList.get(5));

        System.out.println("-3.-------------------------------");
        // проверьте наличие в LinkedList клиента new Person(10L, "Бирюков Виктор Валерьевич", "79185551234", Segment.MASS)
        System.out.println(personLinkedList.contains(new Person(10L, "Бирюков Виктор Валерьевич", "79185551234", Segment.MASS)));

        System.out.println("-4.-------------------------------");
        // выведите 4 элемента LinkedList с извлечением
        // выведите содержимое LinkedList вызовом PersonFirstLoad.print()
        // проанализируйте состав элементов
        System.out.println(personLinkedList.poll());
        System.out.println(personLinkedList.poll());
        System.out.println(personLinkedList.poll());
        System.out.println(personLinkedList.poll());
        System.out.println();
        p.print(personLinkedList);

        System.out.println("-5.-------------------------------");
        // Добавьте в LinkedList клиента new Person(30L, "Шишкин Кирилл Иванович", "79185551332", Segment.MASS)
        // выведите последний элемент LinkedList без извлечения
        // выведите содержимое LinkedList вызовом PersonFirstLoad.print()
        // проанализируйте состав элементов
        personLinkedList.add(new Person(30L, "Шишкин Кирилл Иванович", "79185551332", Segment.MASS));
        System.out.println(personLinkedList.getLast());

        System.out.println("-6.-------------------------------");
        // выведите содержимое LinkedList, используя метод forEach
        for (Person person :
                personLinkedList) {
            System.out.println(person);
        }

        System.out.println("-7.-------------------------------");
        // Выведите последний элемент LinkedList с извлечением
        System.out.println(personLinkedList.pollLast());

        System.out.println("-8.-------------------------------");
        // Выведите первый элемент LinkedList с извлечением
        System.out.println(personLinkedList.pollFirst());

    }
}
