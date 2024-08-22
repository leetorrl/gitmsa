package org.example;


import java.util.List;

public class Main{

    private DBRepository dbRepository = new DBRepository();

    public Main(){

       List<Member> list = dbRepository.select();


       list.stream().forEach(System.out::println);

    }


    public static void main(String []args){

        new Main();


    }

}