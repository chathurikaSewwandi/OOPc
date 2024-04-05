public class Main {
    String language;
    Main(String l ){
        language = l ;
        System.out.println("Language is " + language);
    }
    public static void main(String[] args) {
        Main m1 = new Main("Java");
        Main m2 = new Main("Python");
        Main m3 = new Main("c++");
        Main m4 = new Main("JavaScript");

    }
}
