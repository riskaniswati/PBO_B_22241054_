package com.tutorial;

class Player {
    // Data Member
    String name; // default, bisa di akses oleh class lain
    public int exp; // public, bisa di akses oleh class lain
    private int health; //private, tidak bisa di akses oleh class lain

    Player( String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;


    }


void Display() {
    Player Hero_1 = new Player("Riska", 19, 80);
        System.out.println("Nama Player : " + this.name);
        System.out.println("Player EXP : " + this.exp);
        System.out.println("Player Health : " + this.health);

}
}

public class Main {
    public static void main(String[] args) {
        // instansiasi atau pembuat objek baru
        Player Hero_1 = new Player("Riska", 19, 80);

        Hero_1.Display();

        
    }
}
