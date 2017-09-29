package com.halilcanm;

public class Main {

    public static void main(String[] args) {
        System.out.println("Demo with nine different 'sets' with one overwrite");
        System.out.println();
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>(4);

        hMap.set(10, 55);
        hMap.set(12, 52);
        hMap.set(16, 56);
        hMap.set(10, 50);
        hMap.set(13, 53);
        hMap.set(14, 54);
        hMap.set(15, 55);
        hMap.set(11, 51);
        hMap.set(23, 63);

        hMap.quickDraw();
    }
}
