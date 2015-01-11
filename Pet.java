public class Pet{
    String name;
    int age;
    String color;
    String gender;
    
    Pet(String pname, int page, String pcolor, String pgender){
        name = pname;
        age = page;
        color = pcolor;
        gender = pgender;
    }
    
    public String getname(){
        return name;
    }
    
    public int getage(){
        return age;
    }
    
    public String getcolor(){
        return color;
    }
    
    public String getgender(){
        return gender;
    }
    
    public void printpet(){
        System.out.println("Hi! I am a pet. My name is " + name + ". I am " + age + " years old, am " + color + ", and am " + gender + ". Play with me!");
    }
}