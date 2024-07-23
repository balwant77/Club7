package com.Club7.misc;

import static java.lang.Thread.sleep;

public class MultiThreading implements Runnable {

//    public void run() {
//        test1();
//        test2();
//        test3();
//
//    }
//
//
//    public void test1(){
//        for (int i=0;i<=10;i++) {
//            System.out.println(i);
//
//
//        }
//    }
//
//    public void test2(){
//        try {
//            sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        for(int i=11;i<=20;i++){
//            System.out.println(i);
//        }
//
//    }
//
//    public void test3(){
//        try {
//            sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        for(int i=21;i<=30;i++){
//            System.out.println(i);
//        }
//    }
//
//    public static void main(String[] args) {
//        MultiThreading multi=new MultiThreading();
//
//        multi.start();
//
//    }
    @Override
   public void run(){
        test1();
       test2();
       test3();
   }

    public void test1(){
        for (int i=0;i<=10;i++){
            System.out.println(i);
           try {
               sleep(1000);
           }catch(Exception e){
               System.out.println(e);

            }
           }

    }
    public void test2(){
        for(int i=11;i<=20;i++){
            System.out.println(i);

        }

    }
    public void test3(){
        for(int i=21;i<=30;i++){
            System.out.println(i);

        }


    }

    public static void main(String[] args) {
        MultiThreading thread=new MultiThreading();
        Thread t1=new Thread(thread);
        t1.start();
    }
}
