public class Animal {
    public void eat(){
        System.out.println("Ömniverous diet ! ");
    }
}
class Lion extends Animal{
    public void eat(){
        System.out.println("Carniverous diet !");
    }
}
class Test {
    public static void main(String[] args) {
        Animal a = new Lion();
        a.eat();
    }
}