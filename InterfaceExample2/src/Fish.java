public class Fish implements Animal{
    String name;
    Fish(String name){
        this.name=name;
    }
    @Override
    public void makeSound(){
        System.out.println(name+" make bubbles!");
    }
    @Override
    public void move() {
        System.out.println(name + " is swimming in the water!");
    }
    public void swim(){
        System.out.println(name+" is swimming!");
    }
}
