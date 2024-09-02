import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double altura = sc.nextDouble();
    double massa = sc.nextDouble();
    double imc = massa / (altura * altura);


    
    

    

    System.out.printf("seu IMC é de %.2f kg/m2 %n", imc);

    if (18 <= imc && imc <= 25){
      System.out.println("Você está com o peso ideal");
    }
    
    if (25 <= imc && imc <= 29.9){
      System.out.println("Você está acima do peso"); 
    }
    if (30 <= imc && imc <= 34.9){
      System.out.println("você apresenta obesidade grau 1");
    }
    if (35 <= imc && imc <= 39.9){
      System.out.println("Você apresenta obesidade grau 2");
    }
    if (40 <= imc && imc > 40){
      System.out.println("Você apresenta obesidade grau 3");
    }
    





  sc.close();
  }

  
}