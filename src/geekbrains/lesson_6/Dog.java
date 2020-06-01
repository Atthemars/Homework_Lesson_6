package geekbrains.lesson_6;

class Dog extends Animals {//наследующий класс
    public Dog(String name) {
        super(name);
        this.type = "Dog";
        this.maxRun = random.nextInt(300) + 300;
        this.maxSwim = random.nextInt(6) + 5;
        this.maxJump = Math.random() * 0.7 + 0.1;
    }
}
