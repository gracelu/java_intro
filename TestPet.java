public class TestPet{
     public static void main(String []args){
        Pet puppycat= new Pet("Puppycat", 100, "pink", "male");
        puppycat.printpet();
        
        Dog lucy= new Dog("Lucy", 2, "white", "female");
        
        String n= lucy.getname();
        System.out.println("Dog name: " + n);
        
        lucy.printpet();
        
        
     }
}
