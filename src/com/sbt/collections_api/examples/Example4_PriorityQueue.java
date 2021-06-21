package com.sbt.collections_api.examples;

import com.sbt.collections_api.Person;
import com.sbt.collections_api.PersonFirstLoad;
import com.sbt.collections_api.Segment;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Example4_PriorityQueue {
    public static void main(String[] args) {

        System.out.println("-1.--------------------------------");
        // инициализируйте вызовом PersonFirstLoad.init()
        // выведите содержимое вызовом PersonFirstLoad.print()
        // проанализируйте порядок элементов

        Queue<Person> personPriorityQueue = new PriorityQueue<>();
        PersonFirstLoad p = new PersonFirstLoad();
        p.init(personPriorityQueue);
        p.print(personPriorityQueue);

        System.out.println("-2.--------------------------------");
        // последовательно извлеките все элементы из PriorityQueue и проанализируйте порядок извлечения
        while (!personPriorityQueue.isEmpty()) {
            System.out.println(personPriorityQueue.poll());
        }

        p.print(personPriorityQueue);

        System.out.println("-3.--------------------------------");
        // сформируйте новый объект PriorityQueue, с использованием внешнего Comparator,
        // который будет отдавать приоритет при извлечении клиентам из сегмента Segment.VIP
        // инициализируйте вызовом PersonFirstLoad.init(persons)
        // последовательно извлеките все элементы из PriorityQueue и проанализируйте порядок извлечения

        Queue<Person> personPriorityQueue1 = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o2.getSegment() == Segment.VIP) return 1;
                else if(o1.getSegment() == Segment.VIP) return -1;
                else return 0;
            }
        });
        p.init(personPriorityQueue1);
        while (!personPriorityQueue1.isEmpty()) {
            System.out.println(personPriorityQueue1.poll());
        }


        System.out.println("-4.--------------------------------");
        // инициализируйте вызовом PersonFirstLoad.init()
        // попробуйте извлечь 20 элементов
        // проанализируйте результат

        Queue<Person> personPriorityQueue2 = new PriorityQueue<>();
        p.init(personPriorityQueue2);
        int i=0;
        while (i<20) {
            System.out.println(personPriorityQueue2.poll());
            i++;
        }

    }
}
