package org.example;

import java.awt.print.Printable;

public class Ex04 implements Pringtable {

        public void print(){
            System.out.println("프린트 됨");

        }

        public void doA(){


        }
        public static void main(String[] args) {

          Pringtable print = new Ex04();
          print.print();

          Printable p2  = new Pringtable(){

              public void print(){
                  System.out.println("새로운 프린터");
              }

              public void dOA(){

              }
              p2.print();
          }
        }
    }


