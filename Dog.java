 public class Dog{
    String name;
    String breed;
    int age;
    String color;
    public Dog(String name,String breed,int age ,String color){
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.color=color;
    }
    public static void nar(){
        System.out.println("i love my country");
    }

}
class Neri{
    public static void main(String args[]){
        Dog manuu= new Dog("mal","laura",34,"black");
        System.out.println(manuu.name);
        Dog.nar();
    }
}