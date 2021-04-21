import java.util.Scanner;

 class AreaTriangulo{
  static Scanner teclado=new
  Scanner(System.in);
   
  public static void main(String[]arg){
   //definicion de variables u otros
   System.out.println("Ejercicio 01: Area Triangulo");
   int b=0, h=0, area=0;
   //datos de entrada
   System.out.println("Ingrese Base");
   b=teclado.nextInt();
   System.out.println("Ingrese Altura");
   h=teclado.nextInt();
   //proceso
   area=(b*h)/2;
   //datos de salida
   System.out.println("El Area es: "+area);
 }
}