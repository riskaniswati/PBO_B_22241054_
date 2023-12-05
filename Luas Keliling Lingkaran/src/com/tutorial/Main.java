package com.tutorial;

class Lingkaran {
    float r;
    float diameter;

    public Lingkaran(float r, float diameter) {
        this.r = r;
        this.diameter = diameter;
    }

    void display() {
        float luas = (float) (Math.PI * r * r);
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling lingkaran: " + keliling);
        System.out.println("Luas lingkaran: " + luas);
    }

    public static void main(String[] args) throws Exception {
        Lingkaran lingkaran = new Lingkaran(25, 50);
        System.out.println("Jari-jari: " + lingkaran.r);
        System.out.println("Diameter: " + lingkaran.diameter);
        lingkaran.display();
    }
}
