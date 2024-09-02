package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex04 {

    public static void main(String[] args) throws Exception{

        BufferedWriter bw = new BufferedWriter(new FileWriter("myfile"));

        bw.write("글자를 바꿀거야");
        bw.newLine();//줄바꿈
        bw.write("바꼈냐");
        bw.newLine();
        bw.write("글자 추가추가");
        bw.close();

        BufferedReader fr = new BufferedReader(new FileReader("myfile"));

        while (true) {
            String str = fr.readLine(); //한줄씩 읽음
            System.out.println(str);

            if(str==null){
                break;
            }
        }
    }
}
