package com.company;

public class Skeleton extends Boss {
    private int arrows;

   public String printInfo() {
       return super.printinfo();
   }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
}

