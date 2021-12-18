/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Persona;
import enumerador.Sexo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PersonaServicio {
    

    public Persona crearPersona(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese su Nombre");
        String nombre = leer.next().toUpperCase();
        System.out.println("Ingrese el sexo: H, M o O");
        char sexo = leer.next().toUpperCase().charAt(0);
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        System.out.println("Ingrese su peso");
        double peso = leer.nextDouble();
        System.out.println("Ingrese su altura");
        double altura = leer.nextDouble();
        
        // La logica de poner || no funciona no se porque
        while(sexo != 'H' && sexo != 'M' && sexo != 'O'){
            System.out.println("Genero Incorrecto Elija una de estas Opciones: Hombre(H) o Mujer(M) o Otros (O)");
            sexo = leer.next().toUpperCase().charAt(0);
        }
        
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    
    public int calcularIMC(Persona p1){
        double imc = p1.getPeso()/(Math.pow(p1.getAltura(), 2));
        
        if(imc > 25){
            return 1;
        }else if(imc >= 20 && imc <= 25){
            return 0;
        }else{
            return -1;
        }
    }
    
    public boolean esMayorDeEdad(Persona p1){
        if(p1.getEdad() > 18){
            System.out.println("Es mayor de edad");
            return true;
        }else{
            System.out.println("Es menor de edad");
            return false;
        }
    }
    
    public void mostrarPersona(Persona p1){
        System.out.println(p1.toString());
    }
    
    
    
}
