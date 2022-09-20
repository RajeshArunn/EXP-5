package newpackage;

import newpackage1.Subclass;

public class NewMain extends Subclass{

    public static void main(String[] args) 
    {
       Subclass obj=new Subclass();
       Subclass.display();
       //obj.show(10); is not possible!! because it is a default method
    }
    
}
