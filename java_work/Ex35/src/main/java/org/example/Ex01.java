package org.example;

public class Ex01 {

    public static void main(String[] args) {

            Runnable run1 = () -> {
                try {
                    for (int i = 0; i < 100; i++) {
                        Thread.sleep(100);
                        if (i % 2 == 0) {
                            System.out.println(Thread.currentThread().getName() + "" + i);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("오류1");
                }
            };

            Thread th1 = new Thread(run1);
            th1.start();

     }
}