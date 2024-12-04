public class Bird implements Animal{
    String  name;

    Bird(String name){
        this.name=name;
    }
    @Override
    public void makeSound(){
        System.out.println(name+"is chirping");
    }
    @Override
    public void move(){
        System.out.println(name+" is flying in the sky");
    }
    public void fly(){
        System.out.println(name+"is flying!");
    }
}
