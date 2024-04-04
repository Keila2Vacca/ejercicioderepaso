
package people;

import java.util.Random;

public final class Person {
    private String name;
    private int age;
    private int DNI;
    private char sex;
    private double weight;
    private double height;

    public Person() {
        this.name = "";
        this.age = 0;        
        this.sex = 'H';
        this.weight = 1;
        this.height = 1;
        this.DNI = generaDNI();
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        comprobarSex(sex);
        this.weight = 1;
        this.height = 1;    
        this.DNI = generaDNI();
    }

    public Person(String name, int age, char sex, double weight, double height) {
        this.name = name;
        this.age = age;
        comprobarSex(sex);
        this.weight = weight;
        this.height = height;    
        this.DNI = generaDNI();
    }
    
    public int calcularIMC() {
        final double imc = weight/(height*height);
        if (imc < 20) {
            return -1;
        }
        else if (imc >= 20 && imc <= 25) {
            return 0;
        }
        return 1;
    }
    
    public boolean esMayorDeEdad() {
        if(age >= 18) {
            return true;
        }
        return false;
    }
    
    void comprobarSex(char sex) {
        if (!(sex == 'H' || sex == 'M')) {
            this.sex = 'H';
        }
        else {
            this.sex = sex;
        }
    }
    
    int generaDNI() {
        Random random = new Random();
        return random.nextInt(100000000-9999999) + 9999999;    
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" + "nombre=" + name + ", edad=" + age + ", dni=" + DNI + ", sexo=" + sex + ", peso=" + weight + ", altura=" + height + '}';
    }
    
    public void esMayor() {
        if (esMayorDeEdad()) {
            System.out.println(name + " es mayor de edad.");
        }
        else {
            System.out.println(name + " es menor de edad.");
        }
    }
    
    public void informarPeso() {
        switch(calcularIMC()) {
            case -1 -> System.out.println(name + " se encuentra por debajo de su peso ideal.");
            case 0 -> System.out.println(name + " se encuentra en su peso ideal.");
            case 1 -> System.out.println(name + " tiene sobrepeso.");
            default -> {
            }
        }
    
    }
    
}
