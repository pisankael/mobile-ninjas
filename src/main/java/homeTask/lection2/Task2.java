package hometask.lection2;

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("ArrayList add working time:");
        long time1;
        time1 = System.currentTimeMillis();
        System.out.println("Start" + " " + time1);

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= 10000; i++) {
            list.add(i);
        }
        long time2;
        time2 = System.currentTimeMillis();
        System.out.println("End" + " " + time2);

        long time3;
        time3 = time2 - time1;
        System.out.println("Duration" + " " + time3);
    }


    }

