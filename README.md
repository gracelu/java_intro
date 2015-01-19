# java_intro

Short intro workshop to programming with Java
===================
##Running Java

Online compilers: 
http://www.tutorialspoint.com/codingground.htm
https://ideone.com/

Java on Windows: http://docs.oracle.com/javase/tutorial/getStarted/cupojava/win32.html

Java on Mac: http://www.cs.princeton.edu/courses/archive/spr04/cos126/hello/mac.html

Java compiling environment: Eclipse (https://eclipse.org/downloads/packages/eclipse-ide-eclipse-committers-441/lunasr1)

##Hello, World!

public class HelloWorld{
     public static void main(String []args){
        System.out.println("Hello, World!");
     }
}

##Command Line Input

import java.io.Console;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        Console c = System.console();
        String login = c.readLine("Repeat after me: ");
        System.out.println(login);
     }
}

##Pet Classes
Follow files in repository (Pet, Dog, TestPet) to create classes and play with objects in Java. The files also include some inheritance with Dog and Pet as the Dog class uses the Pet class but overrides the printpet() function to print something similar but altered.

##General Java Tutorials
http://heather.cs.ucdavis.edu/~matloff/Java/JavaIntro.html
http://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html

##Inheritance References
http://examples.javacodegeeks.com/java-basics/java-inheritance-example/
http://www.javabeginner.com/learn-java/java-inheritance
