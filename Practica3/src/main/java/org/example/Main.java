package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce tu nombre:");
        Scanner entrada=new Scanner(System.in);
        String nombre=entrada.next();//Pide el nombre de la persona

        System.out.println("Hola "+ nombre +". Introduce tu edad:");
        int edad = 0;

        try {
            edad=entrada.nextInt(); //Pide la edad de la persona
        } catch (InputMismatchException err) { //Si se mete texto en 'edad' saldra este mensaje
            System.out.println("No se pueden introducir letras en la edad.");
            entrada.nextLine();//Limpia el valor errorneo metido.
        }

        while (edad <= 0){ //En el caso de que el numero sea negativo entra al bucle
            System.out.println("Introduce de nuevo tu edad:");
            edad=entrada.nextInt();
        }

        if (edad>=18){ //Si eres mayor de 18, puedes votar, si no, no puedes y te dice cuantos años te faltan
            System.out.println("Enhorabuena "+ nombre +". Puedes votar.");
        } else {
            System.out.println("Lo siento "+ nombre +". No puedes votar.");
            System.out.println("Te falta "+ (18-edad) +" años para ser mayor de edad.");
        }
    }
}