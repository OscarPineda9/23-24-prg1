import java.util.Scanner;

class AdivinarNumerosTarjeta {

    public static void main (String[] arg) {

        Scanner scanner = new Scanner(System.in);
        int respuesta;
        
		final String NUMEROADIVINAR =" Piensa en un numero del 1 al 99 "
		
		System.out.print(NUMEROADIVINAR);
		
        final String PREGUNTA ="Dime (1 SI / 2 NO) si esta en la tarjeta tu numero ";
   

        int laTarjeta = 1;
        int primerNumero= 1;
        int numeroPorAdivinar = 0;
		
		System.out.print("TARJETA 1");

        System.out.print("| 1 21 41 61 81 |");
        System.out.print("| 3 23 43 63 83 |");
        System.out.print("| 5 25 45 65 85 |");
        System.out.print("| 7 27 47 67 87 |");
        System.out.print("| 9 29 49 69 89 |");
        System.out.print("|11 31 51 71 91 |");
        System.out.print("|13 33 53 73 93 |");
        System.out.print("|15 35 55 75 95 |");
        System.out.print("|17 37 57 77 97 |");
        System.out.print("|19 39 59 79 99 |");

		

        laTarjeta = 1;
        primerNumero = 1;
        System.out.print(PREGUNTA + laTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }
   
        System.out.print("|TARJETA 2|");
		
		System.out.print("|  2 22 42 62 82 |");
		System.out.print("|  3 23 43 63 83 |");
		System.out.print("|  6 26 46 66 86 |");
		System.out.print("|  7 27 47 67 87 |");
		System.out.print("| 10 30 50 70 90 |");
		System.out.print("| 11 31 51 71 91 |");
		System.out.print("| 14 34 54 74 94 |");
		System.out.print("| 15 35 55 75 95 |");
		System.out.print("| 18 38 58 78 98 |");
		System.out.print("| 19 39 59 79 99 |");

        laTarjeta = 2;
        primerNumero = 2;
        System.out.print(PREGUNTA + laTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }

        System.out.print("|TARJETA 3|");
		
		System.out.print("|  4 22 44 62 84 |");
		System.out.print("|  5 23 45 63 85 |");
		System.out.print("|  6 28 46 68 86 |");
		System.out.print("|  7 29 47 69 87 |");
		System.out.print("| 12 30 52 70 92 |");
		System.out.print("| 13 31 53 71 93 |");
		System.out.print("| 14 36 54 76 94 |");
		System.out.print("| 15 37 55 77 95 |");
		System.out.print("| 20 38 60 78    |");
		System.out.print("| 21 39 61 79    |");


        laTarjeta = 3;
        primerNumero = 4;
        System.out.print(PREGUNTA + laTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }
		
		System.out.print("|TARJETA 4|");
		
		System.out.print("|  8 26 44 62 88 |");
		System.out.print("|  9 27 45 63 89 |");
		System.out.print("| 10 28 46 72 90 |");
		System.out.print("| 11 29 47 73 91 |");
		System.out.print("| 12 30 56 74 92 |");
		System.out.print("| 13 31 57 75 93 |");
		System.out.print("| 14 40 58 76 94 |");
		System.out.print("| 15 41 59 77 95 |");
		System.out.print("| 24 42 60 78    |");
		System.out.print("| 25 43 61 79    |");

        laTarjeta = 4;
        primerNumero = 8;
        System.out.print(PREGUNTA + laTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }
		
		System.out.print("|TARJETA 5|");
		
		System.out.print("| 16 26 52 62 88 |");
		System.out.print("| 17 27 53 63 89 |");
		System.out.print("| 18 28 54 80 90 |");
		System.out.print("| 19 29 55 81 91 |");
		System.out.print("| 20 30 56 82 92 |");
		System.out.print("| 21 31 57 83 93 |");
		System.out.print("| 22 48 58 84 94 |");
		System.out.print("| 23 49 59 85 95 |");
		System.out.print("| 24 50 60 86    |");
		System.out.print("| 25 51 61 87    |");

        laTarjeta = 5;
        primerNumero = 16;
        System.out.print(PREGUNTA + laTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }
		
		System.out.print("|TARJETA 6|");
		
		System.out.print("| 32 42 52 62 |");
		System.out.print("| 33 43 53 63 |");
		System.out.print("| 34 44 54 99 |");
		System.out.print("| 35 45 55    |");
		System.out.print("| 36 46 56    |");
		System.out.print("| 37 47 57    |");
		System.out.print("| 38 48 58    |");
		System.out.print("| 39 49 59    |");
		System.out.print("| 40 50 60    |");
		System.out.print("| 41 51 61    |");

        laTarjeta = 6;
        primerNumero = 32;
        System.out.print(PREGUNTA + laTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
        }
		
		System.out.print("|TARJETA 7|");
		
		System.out.print("| 64 74 84 94 |");
		System.out.print("| 65 75 85 95 |");
		System.out.print("| 66 76 86 96 |");
		System.out.print("| 67 77 87 97 |");
		System.out.print("| 68 78 88 98 |");
		System.out.print("| 69 79 89 99 |");
		System.out.print("| 70 80 90    |");
		System.out.print("| 71 81 91    |");
		System.out.print("| 72 82 92    |");
		System.out.print("| 73 83 93    |");

        laTarjeta = 7;
        primerNumero = 64;
        System.out.print(PREGUNTA + laTarjeta + ": ");
        respuesta = scanner.nextInt();
        if (respuesta == 1){
            numeroPorAdivinar = numeroPorAdivinar + primerNumero;
			
		System.out.print("Este es el numero en el que piensas" + numeroPorAdivinar);	
        }
    

    }

    
}