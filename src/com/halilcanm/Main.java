package com.halilcanm;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>(4);

        hMap.set(10, 55);
        hMap.set(12, 52);
        hMap.set(16, 56);
        hMap.set(10, 50);
        hMap.set(13, 53);

        hMap.quickDraw();
    }
}
