package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

    public static void main(String []args){
//파일 경로는 Ex33에 넣으면됨
        try(
                OutputStream os = new FileOutputStream("001.jpg"); //카피파일
                InputStream is = new FileInputStream("a.jpg");     //원본파일
//경로 지정시 /를 추가하면됨 ex : /src
                ){

            byte[] buf = new byte[1024]; //보다 빠르게 복사가능

            while (true){

                int data = is.read(buf);

                System.out.println(data);
                if(data == -1)
                    break;
                os.write(buf,0,data);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
