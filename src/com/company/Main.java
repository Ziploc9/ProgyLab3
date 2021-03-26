package com.company;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         //Ejercicio_1(scan);
        //Ejercicio_2(scan);
       // Ejercicio_3(scan);
        // Ejercicio_4(scan);
        //Ejercicio_Par_Impar(scan);
        //Ejercico_Positivo_Negativo(scan);
       //Ejercicio_7(scan);
        //Ejercicio_8(scan);
       // Ejercicio_9(scan);
       // Ejercicio_10(scan);
       // Ejercicio_11(scan);
       // Ejercicio_12(scan);
        //Ejercicio_13(scan);
       // Ejercicio_14(scan);
       // Ejercicio_15(scan);
       // Ejercicio_16(scan);
       //Ejercicio_17(scan);
       //Ejercicio_18(scan);



    }

    public static void Ejercicio_1(Scanner scan){

        int N = scan.nextInt();
        double A = scan.nextDouble();
        char C = scan.next().charAt(0);

        System.out.println("Valor de N: "+N);
        System.out.println("Valor double de A: "+A);
        System.out.println("Valor char de C: "+C+ " es el ascii: "+(int)C);



    }

    public static void Ejercicio_2(Scanner scan){

        int X = scan.nextInt();
        int Y = scan.nextInt();
        double N = scan.nextDouble();
        double M = scan.nextDouble();

        System.out.println("Sumamos "+X+" con "+M+": "+(X+M));
        System.out.println("Multiplicamos "+Y+" con "+N+": "+(Y*N));
    }

    public static void Ejercicio_3(Scanner scan) {
        int N = scan.nextInt();

        for(int i=0;i<=77;i++)
        {
            N++;
        }
        for(int i = N; i>=3; i--)
        {
            N = i;
        }

        System.out.println(N*2);
    }

    public static void Ejercicio_4(Scanner scan){

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int F = B;
        System.out.println("Start");
        System.out.println("A: "+A+" B:"+B+" C:"+C+" D:"+D+"");
        B = C;
        C = A;
        A = D;
        D = F;
        System.out.println("Transform");
        System.out.println("A: "+A+" B:"+B+" C:"+C+" D:"+D+"");
    }

    public static void Ejercicio_Par_Impar(Scanner scan, int A){
    /** Descomentar para que funcione el ejercicio 5, comentar cuando se finalize**/
        //int A = scan.nextInt();

        if(A%2==0)
        {
            System.out.println("Es par");
        }else
        {
            System.out.println("Es impar");
        }
    }

    public static void Ejercicio_Positivo_Negativo(Scanner scan,int B){

            /**Descomentar para que funcione el ejercicio 6, volver a comentar cuando termines**/
        //int B = scan.nextInt();
        if(B>=0)
        {
            System.out.println("Es positivo");
        }else
        {
            System.out.println("Es negativo");
        }

    }

    public static void Ejercicio_7(Scanner scan){
        int C = scan.nextInt();
        Ejercicio_Par_Impar(scan,C);
       Ejercicio_Positivo_Negativo(scan,C);


        if(C > 100)
            System.out.println("Es mayor a 100");
        else
            System.out.println("Es menor a 100");

        if(C%5 == 0)
            System.out.println("Es multiplo de 5");
        else
            System.out.println("No es multiplo de 5");

        if(C%10 == 0)
            System.out.println("Es multiplo de 10");
        else
            System.out.println("No es multiplo de 10");

    }

    public static void Ejercicio_8(Scanner scan){
        String nombre = scan.nextLine();

        System.out.println("Buenos dias, "+nombre);
    }

    public static void Ejercicio_9(Scanner scan){
        int num = scan.nextInt();

        int doble = num *2;
        int triple = num*3;

        System.out.println("Numero: "+num+" Doble: "+doble+" Triple: "+triple);
    }

    public static void Ejercicio_10(Scanner scan){

        int gradoF = scan.nextInt();

        int centigrados = ((gradoF - 32) * 5) / 9;

        System.out.println("Los grados Fahrenheit son: "+centigrados+" grados centigrados");

    }

    public static void Ejercicio_11(Scanner scan){
        int radioCirc = scan.nextInt();

        double longitud = 2 * 3.14 * radioCirc;

        double area = 3.14 * (radioCirc * radioCirc);

        System.out.println("Radio: "+radioCirc+" Longitud: "+longitud+" Area: "+area);

    }

    public static void Ejercicio_12(Scanner scan){
        double VelKilometros = scan.nextInt();

        double VelMetros = VelKilometros * 5 / 18;

        System.out.println("Inicia a "+VelKilometros+" km/s osea "+VelMetros+" m/s");
    }

    public static void Ejercicio_13(Scanner scan){

        int cateto1 = scan.nextInt();
        int cateto2= scan.nextInt();

        double hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));

        System.out.print("Cateto 1: "+cateto1+" Cateto 2: "+cateto2+" Hipotenusa: "+hipotenusa);
    }

    public static void Ejercicio_14(Scanner scan){

        int radio = scan.nextInt();
        double volumenEsfera = 1.3 * 3.14 * (radio*radio*radio);

        System.out.println("Volument de una esfera: "+volumenEsfera);
    }

    public static void Ejercicio_15(Scanner scan){
        int longitud1 = scan.nextInt();
        int longitud2 = scan.nextInt();
        int area = (longitud2 * longitud1)/2;

        System.out.println("Area del Triangulo de base: "+longitud2+" y altura: "+longitud1+" es: "+area);


    }

    public static void Ejercicio_16(Scanner scan){
        int num = scan.nextInt();

        System.out.println("Primera cifra de " + num + " -> " + (num/100));
        System.out.println("Cifra central de " + num + " -> " + (num/10)%10);
        System.out.println("Última cifra  de " + num + " -> " + (num%10));
    }

    public static void Ejercicio_17(Scanner scan){

        int num = scan.nextInt();

        int decena_deMil = (num/10000);
        int centena = (num/100) - ((num/1000) * 10);
        int unidad = num-((num/10)*10);

        System.out.println(""+decena_deMil+"-"+centena+"-"+unidad);
    }

    public static void Ejercicio_18(Scanner scan) {
        int Hour = scan.nextInt();
        int Min = scan.nextInt();
        int Sec = scan.nextInt();
        boolean value = true;
        if (Hour < 24 && Hour >= 0) {
            System.out.println("Hora correcta: " + Hour);
        }
        else {
            System.out.println("Hora incorrecta");
            value = false;
        }

        if (Min <= 60 && Min >= 0) {
            System.out.println("Minutos correctos: " + Min);
        }else{
            System.out.println("Minutos incorrectos: "+Min);
            value = false;
        }

        if(Sec <=60 && Sec >=0) {
            System.out.println("Segundos correctos: " + Sec);
        }else{
            System.out.println("Segundos incorrectos: "+Sec);
            value = false;
        }

        if(value){
            System.out.println("Son las: "+Hour+":"+Min+":"+Sec);

        }

    }
}