package com.company;
class Subzero{
    private static Subzero msubzero = new Subzero();
    private int ice_power;
    private Subzero(){
        this.ice_power=12;
    }
    public static Subzero getInstance() {
        return msubzero;
    }
    public int getPower(){
        return ice_power;
    }
    public void setPower(int ice_power){
        this.ice_power=ice_power;
    }
}
public class Main {
    public static void main(String[] args) {
        Subzero scorpion = Subzero.getInstance();
        System.out.println(scorpion.getPower());
        scorpion.setPower(50);
        Subzero scorpion1 = Subzero.getInstance();
        System.out.println((scorpion1.getPower()));
        if (scorpion1.hashCode() == scorpion.hashCode()) {
            System.out.println("OK");
        } else {
            System.out.println("Error!");
        }
    }
}