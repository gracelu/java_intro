public class Dog extends Pet{
    Dog(String pname, int page, String pcolor, String pgender){
        super(pname, page, pcolor, pgender);
    }
    
    public void printpet(){
        System.out.println("Woof woof! I am a dog. My name is " + name + ". I am " + age + " years old, am " + color + ", and am " + gender + ". Play with me!");
    }
}