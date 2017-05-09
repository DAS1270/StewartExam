package exercise13;

/**
 * Created by DSQ7LH on 5/8/2017.
 * 13.	Create a class called ClassA with a main method. Create a second class called ClassB that contains
 * a method called indentifyClass. ClassA calls for identifyClass. If you do not wrap ClassB’s method with
 * a try/catch how else can you catch the exception? Hint: be the lazy developer and the pro-active developer. (15 points)
 * */

public class ClassA {
    public static void main(String[] args){
        ClassB aClass = new ClassB();
        try {
            aClass.identifyClass();
        }
        catch(Exception e){
            System.out.println("ClassA Method: Exception: "+e.getMessage());
        }
    }
}
