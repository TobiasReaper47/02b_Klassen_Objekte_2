package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Instanziierung + Wertzuweisung
        Cat cat = new Cat("Grizzabella", "white",29);

        // output("Blick von aussen: " + cat);
        // output("Blick von innen: " + cat.getInstanceVariable());

        // Werte zuweisen
        // cat.firstName = "Grizzabella";
        // cat.furColor = "white";
        // cat.age = 29;

        
        // Werte ausgeben
        output(cat.getFirstName());
        output(cat.getFurColor());
        output(Integer.toString(cat.getAge()));  // EXPLIZITE Typkonvertierung

        output("-----------------------");

        // Instanziierung + Wertzuweisung
        Cat cat2 = new Cat("Alonzo", "grey", 58);

        // output("Blick von aussen: " + cat2);
        // output("Blick von innen: " + cat2.getInstanceVariable());

        // Werte zuweisen
        // cat.firstName = "Alonzo";
        // cat.furColor = "grey";
        // cat.age = 58;

        cat2.setAge(59); //Setter

        // Werte ausgeben
        output(cat2.getFirstName());
        output(cat2.getFurColor());
        output(Integer.toString(cat2.getAge()));

    }

  
    public static void output(String outputStr){
        System.out.println(outputStr);
    }


}

