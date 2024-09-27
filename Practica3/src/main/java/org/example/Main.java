package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce tu nombre:");
        Scanner entrada=new Scanner(System.in);
        String nombre=entrada.next();
        System.out.println("Hola "+ nombre +". Introduce tu edad:");
        int edad=entrada.nextInt();
        while (edad<0){
            System.out.println("Introduce de nuevo tu edad:");
            edad=entrada.nextInt();
        }
        if (edad>=18){
            System.out.println("Enhorabuena "+ nombre +". Puedes votar.");
        } else {
            System.out.println("Lo siente"+ nombre +". No puedes votar.");
            System.out.println("Te falta "+ (18-edad) +" años para ser mayor de edad.");
        }
    }
}