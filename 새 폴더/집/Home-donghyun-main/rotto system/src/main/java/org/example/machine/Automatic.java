package org.example.machine;

import java.util.Arrays;

public class Automatic extends storage {

    public void Aprint(int S) {

        int[] num = new int[45];
        int[] fnum = new int[6];

        for (int i = 0; i < num.length; i++)
               num[i]=i+1;

               int temp;       //처번째 배열로 들어가질 임시공간
               int j;          //번호 담을 그릇
               int count = 0 ; //while 카운터용

               while (true) {
                   count++;
                   for (int i = 0; i < 6; i++) {
                       j = (int) (Math.random() * 45);
                       temp = num[i];
                       num[i] = num[j];
                       num[j] = temp;
                   }
                   for(int i=0; i<6; i++) {
                       fnum[i] = num[i];
                   }
                   Arrays.sort(fnum); // 배열 오름차순 명령어
                   System.out.println(Arrays.toString(fnum));

               if(count==S){
                   System.out.println();
                   System.out.println(end4);
                   break;
                  }
               }
            }
         }