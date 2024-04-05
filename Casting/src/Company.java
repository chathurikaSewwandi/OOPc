public class Company {
    String name;
    public void run(){
        System.out.println("Company ! ");
    }
}
class CFC extends  Company{
    String slogan;
    public void run(){
        System.out.println("Cargils food city ! ");
    }
}
class Tset3{
    public static void main(String[] args) {
        Company c = new CFC();
        c.name = "Cargils pvt ltd ! ";
        CFC cfc= (CFC) c;
        c.name = "Gold !";
        cfc.slogan = "Gedara yna gaman ";
        System.out.println(c.name);
        c.run();
        System.out.println(cfc.name);
        System.out.println(cfc.slogan);
        cfc.run();
    }
}
