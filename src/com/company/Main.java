package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(250);
        boss.setDamage(15);
        System.out.println(boss.getHealth() + "\n" + boss.getDamage());

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(200);
        skeleton.setDamage(20);
        skeleton.weapon.setAug("aug");
        skeleton.weapon.setGunShot("gunshot");
        System.out.println(skeleton.printInfo());
    }
}
