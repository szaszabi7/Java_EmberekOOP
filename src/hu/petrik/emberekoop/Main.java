package hu.petrik.emberekoop;

public class Main {

    public static void main(String[] args) {
        Ember e1 = new Ember("Lakatos István", "1983-1-12", "Budapest");
        Ember e2 = new Ember("Gipsz Jakab", "1968-11-2", "Miskolc");
        Ember e3 = new Ember("Teszt Elek", "2001-8-22", "Kecskemét");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

    }
}
