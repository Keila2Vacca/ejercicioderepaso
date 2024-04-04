
package com.mycompany.persona;

import java.util.Scanner;
import people.Person;


public class Prinpersona {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person Liam = new Person(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextDouble(), sc.nextDouble());
        Person Charlotte = new Person(sc.next(), sc.nextInt(), sc.next().charAt(0));
        Person Charise = new Person();
        Charise.setName("Charise");
        Charise.setAge(17);
        Charise.setSex('M');
        Charise.setWeight(30);
        Charise.setHeight(1.6);
        
        Liam.esMayor();
        Charlotte.esMayor();
        Charise.esMayor();
        
        Liam.informarPeso();
        Charlotte.informarPeso();
        Charise.informarPeso();
        
        System.out.println(Liam.toString());
        System.out.println(Charlotte.toString());
        System.out.println(Charise.toString());
        
    }
}
