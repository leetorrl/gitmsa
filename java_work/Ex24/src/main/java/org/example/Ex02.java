package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {

        person p1 = new person("홍길동",20);
        person p2 = new person("김길동",30);



        List<person> plist = new ArrayList<>();
        plist.add(p1);
        plist.add(p2);

        Iterator<person> iterator = plist.iterator();

        while (iterator.hasNext()){
            person p = iterator.next();
            System.out.println(p);
            iterator.remove(); //리스트 삭제
        }

        System.out.println(plist);
    }
}
