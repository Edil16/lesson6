package com.company;

public class Boss extends GameEnity{
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printinfo() {
        return getHealth() + " " + getDamage() + " " + weapon.getAug() + " " + weapon.getGunShot();
    }
}
