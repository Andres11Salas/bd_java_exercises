import java.util.Scanner;

public class Menu{
    public static void main(String[]args){
        Scanner Lapiz = new Scanner(System.in);
        
        String cerrar; 
        do{
        System.out.println("Ingrese el ejercicio que consultará");

        Int consultas = Lapiz.nextInt();
        Lapiz.nextLine();

        switch (consultas){
        case 1:
            Funciones Ejercicio1 = new Funciones();
            Ejercicio1.getEjercicio1();
            break;
        case 2:
            Funciones Ejercicio2 = new Funciones();
            Ejercicio2.getEjercicio2();
            break; 
        case 3:
            Funciones Ejercicio3 = new Funciones();
            Ejercicio3.getEjercicio3();
            break;
         case 4:
            Funciones Ejercicio4 = new Funciones();
            Ejercicio4.getEjercicio4();
            break;
        case 5:
            Funciones Ejercicio5 = new Funciones();
            Ejercicio5.getEjercicio5();
            break;
        case 6:
            Funciones Ejercicio6 = new Funciones();
            Ejercicio6.getEjercicio6();
            break;
        case 7:
            Funciones Ejercicio7 = new Funciones();
            Ejercicio7.getEjercicio7();
            break;
        case 8:
            Funciones Ejercicio8 = new Funciones();
            Ejercicio8.getEjercicio8();
            break;
        case 9:
            Funciones Ejercicio9 = new Funciones();
            Ejercicio9.getEjercicio9();
            break;
        case 10:
            Funciones Ejercicio10 = new Funciones();
            Ejercicio10.getEjercicio10();
            break;
        case 11:
            Funciones Ejercicio11 = new Funciones();
            Ejercicio11.getEjercicio11();
            break;
        case 12:
            Funciones Ejercicio12 = new Funciones();
            Ejercicio12.getEjercicio12();
            break;
        case 13:
            Funciones Ejercicio13 = new Funciones();
            Ejercicio13.getEjercicio13();
            break;
        case 14:
            Funciones Ejercicio14 = new Funciones();
            Ejercicio14.getEjercicio14();
            break;
        case 15:
            Funciones Ejercicio15 = new Funciones();
            Ejercicio15.getEjercicio15();
            break;
        case 16:
            Funciones Ejercicio16 = new Funciones();
            Ejercicio16.getEjercicio16();
            break;
        case 17:
            Funciones Ejercicio17 = new Funciones();
            Ejercicio17.getEjercicio17();
            break;
        case 18:
            Funciones Ejercicio18 = new Funciones();
            Ejercicio18.getEjercicio18();
            break;
        case 19:
            Funciones Ejercicio19 = new Funciones();
            Ejercicio19.getEjercicio19();
            break;
        case 20:
            Funciones Ejercicio20 = new Funciones();
            Ejercicio20.getEjercicio20();
            break;
        case 21:
            Funciones Ejercicio21 = new Funciones();
            Ejercicio21.getEjercicio21();
            break;
        case 22:
            Funciones Ejercicio22 = new Funciones();
            Ejercicio22.getEjercicio22();
            break;   
        case 23:
            Funciones Ejercicio23 = new Funciones();
            Ejercicio23.getEjercicio23();
            break;   
        case 24:
            Funciones Ejercicio24 = new Funciones();
            Ejercicio24.getEjercicio24();
            break;   
        case 25:
            Funciones Ejercicio25 = new Funciones();
            Ejercicio25.getEjercicio25();
            break;
         default;
            break;        
        }
         System.out.println("¿Desea ver otro ejercicio? \ F para No y V para Si");

         String cerrar = Lapiz.nextLine();
         } while(cerrar.equa1signoreCase(anotherString:"F"));
    }
}