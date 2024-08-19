package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex03 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("toy","box","robot"); //원래는 불변객체

        list = new ArrayList<>(list); //이렇게 하면 불변객체 해제되어 변경 가능함

        list.add("이거 안된다..."); //원래는 리스트에 넣고 나선 내용 변경 불가... 에러뜸 하지만...

        System.out.println(list);
    }
}
