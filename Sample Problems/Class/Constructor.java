public class Constructor {
    //It's a special method which is used to initialize the properties of the class while creating object.
    //Types: Default constructor, parametrized constructor, copy constructor
    //Default constructor is executed first, then parametrized
    Vehicle obj=new Vehicle();
    //obj.whee

}
class Vehicle{
    int wheels;
    Vehicle(){
        wheels=2;
        System.out.println("Default Constructor");
    }
    Vehicle(int wheelCount){
        wheels=8;
        System.out.println("Parametrized Constructor");

    }
    void display(){
        System.out.println("Number of wheels: "+wheels);
    }
}