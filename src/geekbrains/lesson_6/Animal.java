package geekbrains.lesson_6;


import java.util.Random;

class Animals {//super class
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;
    public Random random = new Random();

    public Animals(String name){
        this.name = name; // при создании объекта нужно ввести имя
    }

    public void run(int dist) { //инфо выполнении задания для определённого животного
        if (this.maxRun >= dist) System.out.println(this.type + " " + this.name + " run " + dist + " m.");
        else System.out.println(this.type + " " + " too long distance for "  + this.name);
    }

    public void swim(int dist) {// инфо выполнении задания для определённого животного
        if (this.maxSwim >= dist) System.out.println(this.type + " " + this.name + " swim " + dist + " m.");
        else System.out.println(this.type + " " + this.name + " can't swim so far.");
    }

    public void jump(double height) {// инфо выполнении задания для определённого животного
        if (this.maxJump >= height)
            System.out.println(this.type + " " + this.name + " jump " + height + " m.");
        else System.out.println(this.type + " " + this.name + " can't jump so hi.");
    }

    public void info() { // выводит сведения об объекте в разрезе дейсвтий
        System.out.println(this.type + " " + this.name + " Run: " + this.maxRun + " m., Swim: " + this.maxSwim + " m., Jump: " + this.maxJump + " m.");
    }
}

