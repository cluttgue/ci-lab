package com.mycompany.app;
/**
 * Hello world!
 *
 */
public class App {
  

  public static String triangulo(int a, int b, int c) {
    if((a==b && b==c && c==a) && (a!=0 && b!=0 && c!=0)){
      return "es un triangulo equilatero";
    }
    return "error no es un triangulo";
  } 
  

  public static void main(String[] args) {
    System.out.println("Hola Gente!");
  }
}
