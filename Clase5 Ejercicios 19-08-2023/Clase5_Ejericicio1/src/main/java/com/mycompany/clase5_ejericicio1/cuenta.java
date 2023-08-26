
package com.mycompany.clase5_ejericicio1;

public class cuenta{
        String nombre;
        String apellido;
        int saldo;

        public cuenta(String nombre, String apellido, int saldo) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.saldo = saldo;
        }
        
        public void debitar(int debito){
            this.saldo -= debito;
        }
        
        public void abonar (int abono){
            this.saldo += abono;
        }
        
        public void mostrar (){
        
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Apedillo: " + this.apellido);
            System.out.println("Saldo" + this.saldo);
        }
            
    
    }
