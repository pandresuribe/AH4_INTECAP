package com.mycompany.clase5_ejericicio1;

import java.util.Scanner;

public class menu {
    
    public static void ejecucion (){
        cuenta ob1 = new cuenta("Ernesto", "Ramos",500);
        cuenta ob2 = new cuenta("Evelyn", "Garcia",300);
        Scanner sp = new Scanner(System.in);
        
        while (true) {            
                System.out.println("*************************");
                System.out.println("*   1. Mostrar Cuenta   *");
                System.out.println("*   2. Abonar Cuenta    *");
                System.out.println("*   3. Debitar Cuenta   *");
                System.out.println("*   4.     Salir        *");
                System.out.println("*************************");
                int opcion = sp.nextInt();
                
                switch (opcion) {
                case 1:
                    System.out.println("Ingresa si quieres cuenta 1 o 2");
                    int valor = sp.nextInt();
                    if (valor == 1) {
                        ob1.mostrar();
                    } else {
                        ob2.mostrar();
                    }
                    break;
                case 2:
                    System.out.println("Ingresa si quieres cuenta 1 o 2");
                    valor = sp.nextInt();
                    System.out.println("Ingrese el valor a abonar");
                    if (valor == 1) {
                        ob1.abonar(sp.nextInt());
                    } else {
                        ob2.abonar(sp.nextInt());
                    }
                    break;
                case 3:
                    System.out.println("Ingresa si quieres cuenta 1 o 2");
                    valor = sp.nextInt();
                    System.out.println("Ingrese el valor a debitar");
                    if (valor == 1) {
                        ob1.debitar(sp.nextInt());
                    } else {
                        ob2.debitar(sp.nextInt());
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                    
            }
        }
    }
    public static void main(String[] args) {
        menu.ejecucion();
    }
}
