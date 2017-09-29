package com.halilcanm;

public class Main {

    public static void main(String[] args) {
        System.out.println("Demo with nine different 'sets' with one overwrite");
        System.out.println();
        HashMap<String, Integer> hMap = new HashMap<String, Integer>(4);

        hMap.set("the", 53);
        hMap.set("quick", 52);
        hMap.set("brown", 56);
        hMap.set("fox", 50);
        hMap.set("jumped", 53);
        hMap.set("over", 54);
        hMap.set("the", 55);
        hMap.set("lazy", 51);
        hMap.set("dog", 63);

        hMap.quickDraw();
    }
}
