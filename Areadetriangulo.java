
package miPaquete;

import java.util.Scanner;

//@author mabelvelez


//EJERCICIO: Desarrollar un programa en Lenguaje Java, que permita hallar el área y el perímetro de un triángulo:


public class Areadetriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  float base, altura, area, perimetro, lado1, lado2 = 0.0f;
           Scanner teclado = new Scanner (System.in);

        //Le muestor al usuario un mensaje en pantalla que indica la función del programa.

        System.out.println("Programa que calcula el área y el perímetro de un triángulo. ");
        System.out.println("--------------------------------------------------------------");
        System.out.println("\n");

        //Le solicito al usuario que ingrese los valores correspondientes para calcular el área y el perímetro de un triángulo.


        System.out.print("Ingrese el valor de la base: "); base =teclado.nextFloat ();
        System.out.print("Ingrese el valor de la altura: "); altura = teclado.nextFloat();
        System.out.print("Ingrese el valor del lado 1: "); lado1 = teclado.nextFloat();
        System.out.print("Ingrese el valor del lado 2: "); lado2 = teclado.nextFloat();

        //Calculo el área y el perímetro del triángulo de acuerdo a sus fórmulas y los valores dados.
        
        area = base * altura /2;
        perimetro = lado1 + lado2 + base;

        //Agrupo los valores iniciales y los valores hallados para generarle al usuario un resumen de los cálculos.

        generarSalida (base, lado1, lado2, altura, area, perimetro);
    }//Cierro el public static void.

    //Llamo la función y redeclaro variables de 'generarSalida'
        
        public static void generarSalida(float base, float lado1, float lado2, float altura, float area, float perimetro) {
        System.out.println("\n");

    //Genero devolución al usuario con los valores dados y los cálculos realizados.

        System.out.println("De acuerdo a los datos ingresados, el área y el perímetro del triángulo son: ");System.out.println("======================================================================");
        System.out.println("Base \t Altura \t Lado 1 \t Lado 2 \t Área \t Perímetro");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(base + "\t" + altura + "\t\t\t" + lado1 + "\t\t" + lado2 + "\t\t" + area + "\t\t" + perimetro);
        System.out.println("======================================================================");
    }}//Cierro llamado de función.
