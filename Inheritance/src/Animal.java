public class Animal {
    String name;
    public void eat(){
        System.out.println("I can eat ! ");
    }

}
class  Human extends  Animal{
    public void show(){
        System.out.println("My name is : "+ name);
    }
}
class test extends  Human{
    public static void main(String[] args) {
        Human chathu = new Human();
        chathu.name = "chathurika";
        chathu.show();
        chathu.eat();

    }
}
