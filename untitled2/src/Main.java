interface Animals{
     void sound();
    default void sleep(){
        System.out.println("zwierze idzie spac");
    }
    static void endOfDay(){
        System.out.println("dzien sie skonczyl i zwierzeta ida spac");
    }
    static void eat(){
        System.out.println("zwierze zaczyna jesc");
    }
}
class Dog implements Animals{
    public void sound(){
        System.out.println("hau hau");
    }
}
class Cat implements Animals{
    public void sound(){
        System.out.println("miau miau");
    }
}
class Bird implements Animals{
    public void sound(){
        System.out.println("cwir cwir");
    }
}
class Cow implements Animals{
    public void sound(){
        System.out.println("muuu muuuu ");
    }
}
public class Main {
    public static void main(String[] args) {
    Animals dog = new Dog();
    dog.sound();
    dog.sleep();
    Animals.endOfDay();

    Animals cat = new Cat();
    cat.sound();
    cat.sleep();
    Animals.endOfDay();

    Animals bird = new Bird();
    bird.sound();
    bird.sleep();
    Animals.eat();

    Animals cow = new Cow();
    cow.sound();
    cow.sleep();
    Animals.eat();
    }
}