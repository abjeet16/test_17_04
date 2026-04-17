public class Main {
    public static void main(String[] args) {
        Flower3 f = new Flower3();
        f.display();
    }
}
class Flower1{
    public void display(){
        System.out.println("this is the parent most flower");
    }
}
class Flower2 extends Flower1{ }
class Flower3 extends Flower2{ }
