package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {


        List<String> list = new ArrayList();

        list.add("toy");
        list.add("robot");
        list.add("box");

        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(0));

        person p1 = new person("홍길동",20);
        person p2 = new person("김길동",30);

        System.out.println(p1);
        System.out.println(p2);

        List<person> plist = new ArrayList<>();
        plist.add(p1);
        plist.add(p2);

        System.out.println(plist);
    }
}
