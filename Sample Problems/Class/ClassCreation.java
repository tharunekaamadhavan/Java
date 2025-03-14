
public class ClassCreation {
    public static void main(String[]args){
    Database obj=new Database();
    obj.age=50;
    obj.roll_no=68;
    obj.Name="GOAT";
    obj.display();
}
}
class Database{
    int age;
    int roll_no;
    String Name;
    void display(){
        System.out.println("Name: "+Name);
        System.out.println("Age: "+age);
        System.out.println("Roll No.: "+roll_no);

    }
}