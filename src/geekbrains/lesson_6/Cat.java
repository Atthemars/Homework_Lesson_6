package geekbrains.lesson_6;

class Cat extends Animals {//наследующий класс
    public Cat(String name) {
        super(name);// наследуюемый признак
        this.maxJump = 2.0;
        this.maxRun = random.nextInt(45) + 155;
        this.type = "Cat";
    }

    @Override
    public void swim(int dist) {
        System.out.println("Cat cant swim :|");
    }
}
