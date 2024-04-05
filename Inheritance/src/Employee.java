public class Employee {
    float salary = 5000;
}
class JavaProgrammer extends  Employee {
    int bouns = 5000;


    public static void main(String[] args) {

    JavaProgrammer sewwa = new JavaProgrammer();

        System.out.println("Java Programmer salary is " + sewwa.salary);
        System.out.println("Java Programmer Bouns is " + sewwa.bouns);
        System.out.println("Java Programmer  gross salary is " + (sewwa.salary + sewwa.bouns));
    }
}