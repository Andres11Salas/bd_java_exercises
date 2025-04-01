import java.util.Scanner;
import java.util.decimalFormat;


public class Funciones{
    private void Ejercicio1(){
        Scanner leer = new scanner(System.in)
        System.out.println("Cuantos numeros desea generar")
     }


    //Obtener el promedio de edad de tres personas

    private void Ejercicio2(){
        int edad1, edad2, edad3;
        float promedio;
    
        edad1 = leerEdad();
        edad2 = leerEdad();
        edad3 = leerEdad();

        promedio = (edad1 + edad2 + edad3) / 3.0f;

        System.out.println("Promedio de edad: " + promedio);
     }

    //Ganancias de una inversión a un 2% mensual

    private void Ejercicio3(){
        float capital, ganancias;

        capital = leerCapital();

        ganancias = capital * 0.02f;

        System.out.println("Ganancias después de un mes: " + ganancias);
     }

    //Sueldo total de un vendedor

    private void Ejercicio4(){
        float sueldoBase, venta1, venta2, venta3, comisiones, total;

        sueldoBase = leerSueldoBase();
        venta1 = leerVenta();
        venta2 = leerVenta();
        venta3 = leerVenta();

        comisiones = (venta1 + venta2 + venta3) * 0.10f;
        total = sueldoBase + comisiones;

        System.out.println("Comisiones: " + comisiones);
        System.out.println("Total a recibir: " + total);
     }

    //Cálculo del total a pagar con descuento

    private void Ejercicio5(){
        float totalCompra, descuento, totalPagar;

        totalCompra = leerTotalCompra();

        descuento = totalCompra * 0.15f;
        totalPagar = totalCompra - descuento;

        System.out.println("Total a pagar: " + totalPagar);
     }

    //Calificación final en computación

    private void Ejercicio6(){
        float cal1, cal2, cal3, examenFinal, trabajoFinal, promedioFinal;

        cal1 = leerCalificacion();
        cal2 = leerCalificacion();
        cal3 = leerCalificacion();
        examenFinal = leerCalificacion();
        trabajoFinal = leerCalificacion();

        promedioFinal = (cal1 + cal2 + cal3) / 3 * 0.55f + examenFinal * 0.30f + trabajoFinal * 0.15f;

        System.out.println("Calificación final: " + promedioFinal);
     }

    //Porcentaje de hombres y mujeres

    private void Ejercicio7(){
        int totalEstudiantes, hombres, mujeres;
        float porcentajeHombres, porcentajeMujeres;

        totalEstudiantes = leerTotalEstudiantes();
        hombres = leerHombres();
        mujeres = totalEstudiantes - hombres;

        porcentajeHombres = (hombres / (float)totalEstudiantes) * 100;
        porcentajeMujeres = (mujeres / (float)totalEstudiantes) * 100;

        System.out.println("Porcentaje de hombres: " + porcentajeHombres);
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres);
     }

    //Conversión de metros a pies y pulgadas

    private void Ejercicio8(){
        float metros, pulgadas, pies;

        metros = leerMetros();

        pulgadas = metros * 39.27f;
        pies = pulgadas / 12;

        System.out.println("Pies: " + pies);
        System.out.println("Pulgadas: " + pulgadas);
     }

    //Área de un triángulo

    private void Ejercicio9(){
        float a, b, c, p, area;

        a = leerLado();
        b = leerLado();
        c = leerLado();

        p = (a + b + c) / 2;
        area = (float)Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Área del triángulo: " + area);
     }

    //Salario neto de un trabajador

    private void Ejercicio10(){
        float horasTrabajadas, precioHora, sueldoBase, sueldoNeto;
        
        horasTrabajadas = leerHorasTrabajadas();
        precioHora = leerPrecioHora();

        sueldoBase = horasTrabajadas * precioHora;
        sueldoNeto = sueldoBase * 0.80f; // 20% de descuento

        System.out.println("Salario neto: " + sueldoNeto);
     }

    //Conversión de divisas

    private void Ejercicio11(){
        float chelines, dracmas, pesetas, dolares, liras;

        chelines = leerCheques();
        dracmas = leerDracmas();
        pesetas = leerPesetas();

        float pesetasPorCheline = 956.871f; // 100 chelines a pesetas
        float pesetasPorDracma = 88.607f; // 100 dracmas a pesetas
        float dolaresPorPeseta = 1 / 122.499f; // 1 dólar a pesetas
        float lirasPorPeseta = 1 / 9.289f; // 100 liras a pesetas

        float pesetasDeCheline = chelines * pesetasPorCheline / 100;
        float francosDeDracma = dracmas * pesetasPorDracma / 100;
        float dolaresDePeseta = pesetas * dolaresPorPeseta;
        float lirasDePeseta = pesetas * lirasPorPeseta;

        System.out.println("Pesetas de chelines: " + pesetasDeCheline);
        System.out.println("Francos de dracmas: " + francosDeDracma);
        System.out.println("Dólares de pesetas: " + dolaresDePeseta);
        System.out.println("Liras de pesetas: " + lirasDePeseta);
     }

    //Cálculo de salario con deducciones

    private void Ejercicio12(){
        String nombre;
        float horasNormales, pagoHoraNormal, horasExtras, sueldoBase, deducciones, sueldoNeto;

        nombre = leerNombre();
        horasNormales = leerHorasNormales();
        pagoHoraNormal = leerPagoHora();
        horasExtras = leerHorasExtras();

        sueldoBase = (horasNormales * pagoHoraNormal) + (horasExtras * pagoHoraNormal * 1.25f);

        deducciones = sueldoBase * 0.14f; // 5% + 2% + 7%
        sueldoNeto = sueldoBase - deducciones;

        System.out.println("Deducciones: " + deducciones);
        System.out.println("Sueldo neto: " + sueldoNeto);
     }

    //Promedio en materias

    private void Ejercicio13(){
        float matematicaExamen, matematicaTareas, fisicaExamen, fisicaTareas, quimicaExamen, quimicaTareas;
        float promedioMatematica, promedioFisica, promedioQuimica;

        matematicaExamen = leerCalificacion();
        matematicaTareas = leerCalificacion();
        fisicaExamen = leerCalificacion();
        fisicaTareas = leerCalificacion();
        quimicaExamen = leerCalificacion();
        quimicaTareas = leerCalificacion();

        promedioMatematica = matematicaExamen * 0.9f + (matematicaTareas / 3) * 0.1f;
        promedioFisica = fisicaExamen * 0.8f + (fisicaTareas / 2) * 0.2f;
        promedioQuimica = quimicaExamen * 0.85f + (quimicaTareas / 3) * 0.15f;

        System.out.println("Promedio Matemática: " + promedioMatematica);
        System.out.println("Promedio Física: " + promedioFisica);
        System.out.println("Promedio Química: " + promedioQuimica);
     }

    //Total en billetes

    private void Ejercicio14(){
        int N1, N2, N3, N4, N5, N6, N7, N8;
        float total;

        N1 = leerBilletes(50000);
        N2 = leerBilletes(20000);
        N3 = leerBilletes(10000);
        N4 = leerBilletes(5000);
        N5 = leerBilletes(2000);
        N6 = leerBilletes(1000);
        N7 = leerBilletes(500);
        N8 = leerBilletes(100);

        total = N1 * 50000 + N2 * 20000 + N3 * 10000 + N4 * 5000 + N5 * 2000 + N6 * 1000 + N7 * 500 + N8 * 100;

        System.out.println("Total en el banco: " + total);
     }

    //Sistema de ecuaciones lineales

    private void Ejercicio15(String[] args) {
        float a, b, c, d, e, f, X, Y;

        a = leerNumero();
        b = leerNumero();
        c = leerNumero();
        d = leerNumero();
        e = leerNumero();
        f = leerNumero();

        X = (c * e - b * f) / (a * e - b * d);
        Y = (c - a * X) / b;

        System.out.println("X: " + X);
        System.out.println("Y: " + Y);
     }

    //Monto total a pagar de luz eléctrica

    private void Ejercicio16(){
        float lecturaAnterior, lecturaActual, costoPorKwh, totalAPagar;

        lecturaAnterior = leerLectura();
        lecturaActual = leerLectura();
        costoPorKwh = leerCosto();

        totalAPagar = (lecturaActual - lecturaAnterior) * costoPorKwh;

        System.out.println("Monto total a pagar: " + totalAPagar);
    }
     }

    //Piezas fabricadas y desperdicio

    private void Ejercicio17(){
        float largo, ancho, consumo, areaLamina, numPiezas, desperdicio;

        largo = 4;
        ancho = 1.5f;
        consumo = 0.5f;

        areaLamina = largo * ancho;
        numPiezas = areaLamina / consumo;
        desperdicio = areaLamina % consumo;

        System.out.println("Número de piezas: " + numPiezas);
        System.out.println("Desperdicio: " + desperdicio);
     }

    //Porcentaje de descuento

    private void Ejercicio18(){
        float precioFinal, precioPVP, porcentajeDescuento;

        precioFinal = leerPrecioFinal();
        precioPVP = leerPrecioPVP();

        porcentajeDescuento = ((precioPVP - precioFinal) / precioPVP) * 100;
        
        System.out.println("Porcentaje de descuento: " + porcentajeDescuento);
     }

    //Cálculo de cobro en gasolinera

    private void Ejercicio19(){
        float galones, precioLitro, totalCobro;
        final float LITROS_POR_GALON = 3.785f;

        galones = leerGalones();
        precioLitro = 100; // Precio en bolívares

        totalCobro = galones * LITROS_POR_GALON * precioLitro;

        System.out.println("Total a cobrar: " + totalCobro);
     }

    //Presupuesto del hospital

    private void Ejercicio20(){
        float presupuesto, ginecologia, traumatologia, pediatria;

        presupuesto = leerPresupuesto();

        ginecologia = presupuesto * 0.40f;
        traumatologia = presupuesto * 0.30f;
        pediatria = presupuesto * 0.30f;

        System.out.println("Ginecología: " + ginecologia);
        System.out.println("Traumatología: " + traumatologia);
        System.out.println("Pediatría: " + pediatria);
     }

    //Porcentaje anual de un préstamo

    private void Ejercicio21(){
        float X, Y, porcentaje;

        X = leerCapital();
        Y = leerIntereses();

        porcentaje = (Y * 100) / (X * 4);

        System.out.println("Porcentaje anual: " + porcentaje);
     }

    //Porcentaje de ganancia en la venta de naranjas

    private void Ejercicio22(){
        int X;
        float Y, K, porcentajeGanancia;

        X = leerCantidadNaranjas();
        Y = leerPrecioDocena();
        K = leerPrecioVenta();
        
        porcentajeGanancia = ((K - (X * Y / 12)) / (X * Y / 12)) * 100;

        System.out.println("Porcentaje de ganancia: " + porcentajeGanancia);
     }

    //Porcentaje de recargo en cuotas

    private void Ejercicio23(){
        float P, T, totalPagado, recargo;

        P = leerPrecioContado();
        T = leerCuota();
  
        totalPagado = T * 12;

        recargo = ((totalPagado - P) / P) * 100;

        System.out.println("Recargo en cuotas: " + recargo);
     }

    // Ingreso total por venta de productos de maíz

    private void Ejercicio24(){
        float M, N, B1, B2, B3, ingresoTotal;

        M = leerKilogramosHarina();
        N = leerLitrosAceite();
        B1 = leerPrecioBultoHarina();
        B2 = leerPrecioCajaAceite();
        B3 = leerPrecioHarinaDetallado();
        B4 = leerPrecioAceiteDetallado();

        ingresoTotal = (M / 24 * B1) + (N / 15 * B2) + ((M % 24) * B3) + ((N % 15) * B4);

        System.out.println("Ingreso total: " + ingresoTotal);
     }

    //Ejercicio24

    private void Ejercicio24(){
        Scanner scanner = new Scanner(System.in);
        double inversion, interes, total;

        System.out.print("Ingrese la cantidad invertida: ");
        inversion = scanner.nextDouble();

        interes = inversion * 0.05; // 5% de interés
        System.out.println("Intereses generados: " + interes);

        if (interes > 7000) {
            total = inversion + interes;
            System.out.println("Total después de reinvertir: " + total);
        } else {
            System.out.println("No se reinvierten los intereses.");
        }
     }

    //Ejercicio 25

    private void Ejercicio25(){
        Scanner scanner = new Scanner(System.in);
        double sueldo, nuevoSueldo;

        System.out.print("Ingrese el sueldo del trabajador: ");
        sueldo = scanner.nextDouble();

        if (sueldo < 40000) {
            nuevoSueldo = sueldo * 1.15; // 15% de aumento
        } else {
            nuevoSueldo = sueldo * 1.12; // 12% de aumento
        }

        System.out.println("Nuevo sueldo: " + nuevoSueldo);
     }

    //Ejercicio 26

    private void Ejercicio26(){
        Scanner scanner = new Scanner(System.in);
        int A, B, C, D;

        System.out.print("Ingrese A: ");
        A = scanner.nextInt();
        System.out.print("Ingrese B: ");
        B = scanner.nextInt();
        System.out.print("Ingrese C: ");
        C = scanner.nextInt();
        System.out.print("Ingrese D: ");
        D = scanner.nextInt();

        if (D == 0) {
            System.out.println("Resultado: " + Math.pow((A - C), 2));
        } else if (D > 0) {
            System.out.println("Resultado: " + Math.pow((A - B), 3) / D);
        }
     }

    //Ejercicio 27

    private void Ejercicio27(){
        Scanner scanner = new Scanner(System.in);
        double valor1, valor2, area;

        System.out.print("Ingrese Valor 1: ");
        valor1 = scanner.nextDouble();
        System.out.print("Ingrese Valor 2: ");
        valor2 = scanner.nextDouble();
        System.out.print("Ingrese Valor 3 (área): ");
        double areaComprobacion = scanner.nextDouble();

        // Triángulo
        area = (valor1 * valor2) / 2;
        if (area == areaComprobacion) {
            System.out.println("Figura: Triángulo");
        }

        // Círculo
        area = Math.PI * Math.pow(valor1, 2);
        if (area == areaComprobacion) {
            System.out.println("Figura: Círculo");
        }

        // Rectángulo
        area = valor1 * valor2;
        if (area == areaComprobacion) {
            System.out.println("Figura: Rectángulo");
        }
     }

    //Ejercicio 28

    private void Ejercicio28(){
        Scanner scanner = new Scanner(System.in);
        double montoTotal, inversion, prestamo, credito, intereses;

        System.out.print("Ingrese el monto total de la compra: ");
        montoTotal = scanner.nextDouble();

        if (montoTotal > 500000) {
            inversion = montoTotal * 0.55;
            prestamo = montoTotal * 0.30;
            credito = montoTotal - (inversion + prestamo);
        } else {
            inversion = montoTotal * 0.70;
            credito = montoTotal * 0.30;
        }

        intereses = credito * 0.20; // 20% de intereses

        System.out.println("Inversión de la empresa: " + inversion);
        System.out.println("Monto a pagar a crédito: " + credito);
        System.out.println("Monto a pagar por intereses: " + intereses);
        if (montoTotal > 500000) {
            System.out.println("Cantidad prestada al banco: " + prestamo);
        }
     }

    //Ejercicio 29

    private void mEjercicio29(){
        Scanner scanner = new Scanner(System.in);
        double venta1, venta2, venta3, totalVentas, salario = 1000; // Suponiendo un salario base

        System.out.print("Ingrese ventas del departamento 1: ");
        venta1 = scanner.nextDouble();
        System.out.print("Ingrese ventas del departamento 2: ");
        venta2 = scanner.nextDouble();
        System.out.print("Ingrese ventas del departamento 3: ");
        venta3 = scanner.nextDouble();

        totalVentas = venta1 + venta2 + venta3;
        double umbral = totalVentas * 0.33;

        if (venta1 > umbral) {
            salario += salario * 0.20; // 20% de aumento
        }
        if (venta2 > umbral) {
            salario += salario * 0.20; // 20% de aumento
        }
        if (venta3 > umbral) {
            salario += salario * 0.20; // 20% de aumento
        }

        System.out.println("Salario final de los vendedores: " + salario);
     }

    //Ejercicio 30


    private void Ejercicio33(){
        Scanner scanner = new Scanner(System.in);
        int A, B, C, D, N;

        System.out.print("Ingrese A: ");
        A = scanner.nextInt();
        System.out.print("Ingrese B: ");
        B = scanner.nextInt();
        System.out.print("Ingrese C: ");
        C = scanner.nextInt();
        System.out.print("Ingrese D: ");
        D = scanner.nextInt();

        N = A * 1000 + B * 100 + C * 10 + D;

        int redondeado = (N + 50) / 100 * 100; // Redondear a la centena más cercana
        System.out.println("Número redondeado: " + redondeado);
     }

    //Ejercicio 31
    private void Ejercicio31(){
        Scanner scanner = new Scanner(System.in);
        double distancia, costo;

        System.out.print("Ingrese la distancia recorrida en km: ");
        distancia = scanner.nextDouble();

        if (distancia <= 300) {
            costo = 5000;
        } else if (distancia > 300 && distancia < 1000) {
            costo = 5000 + (distancia - 300) * 200;
        } else {
            costo = 5000 + (700) * 200 + (distancia - 1000) * 150;
        }

        System.out.println("Monto a pagar: " + costo);
     }

    //Ejercicio 32

    private void Ejercicio32(){
        Scanner scanner = new Scanner(System.in);
        int P, Q;

        System.out.print("Ingrese P: ");
        P = scanner.nextInt();
        System.out.print("Ingrese Q: ");
        Q = scanner.nextInt();

        if (Math.pow(P, 3) + Math.pow(Q, 4) - 2 * Math.pow(P, 2) > 680) {
            System.out.println("P: " + P + ", Q: " + Q);
        } else {
            System.out.println("No se cumple la condición.");
        }
     }

    //Ejercicio 33

    private void Ejercicio33(){
        Scanner scanner = new Scanner(System.in);
        String nombre;
        double monto, descuento = 0;

        System.out.print("Ingrese el nombre del cliente: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese el monto de la compra: ");
        monto = scanner.nextDouble();

        if (monto < 500) {
            descuento = 0;
        } else if (monto <= 1000) {
            descuento = monto * 0.05;
        } else if (monto <= 7000) {
            descuento = monto * 0.11;
        } else if (monto <= 15000) {
            descuento = monto * 0.18;
        } else {
            descuento = monto * 0.25;
        }

        double montoAPagar = monto - descuento;
        System.out.println("Cliente: " + nombre);
        System.out.println("Monto a pagar: " + montoAPagar);
        System.out.println("Descuento recibido: " + descuento);
     }

    //Ejercicio 34

    private void Ejercicio34(){
        Scanner scanner = new Scanner(System.in);
        String categoria;
        double sueldo, aumento;

        System.out.print("Ingrese la categoría del trabajador: ");
        categoria = scanner.nextLine();
        System.out.print("Ingrese el sueldo del trabajador: ");
        sueldo = scanner.nextDouble();

        switch (categoria.toLowerCase()) {
            case "a":
                aumento = sueldo * 0.10;
                break;
            case "b":
                aumento = sueldo * 0.15;
                break;
            case "c":
                aumento = sueldo * 0.20;
                break;
            default:
                aumento = 0;
        }

        double nuevoSueldo = sueldo + aumento;
        System.out.println("Categoría: " + categoria + ", Nuevo sueldo: " + nuevoSueldo);
     }

    //Ejercicio 35

    private void Ejercicio35(){
        Scanner scanner = new Scanner(System.in);
        double temperatura;

        System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
        temperatura = scanner.nextDouble();

        if (temperatura < 32) {
            System.out.println("Deporte: Esquí");
        } else if (temperatura < 50) {
            System.out.println("Deporte: Patinaje sobre hielo");
        } else if (temperatura < 70) {
            System.out.println("Deporte: Senderismo");
        } else {
            System.out.println("Deporte: Natación");
        }
     }

    //Ejercicio 36

    private void Ejercicio36(){
        Scanner scanner = new Scanner(System.in);
        int cantidad;

        System.out.print("Ingrese la cantidad en Bolívares: ");
        cantidad = scanner.nextInt();

        int[] billetes = {50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50, 20, 10};

        for (int billete : billetes) {
            int cantidadBilletes = cantidad / billete;
            if (cantidadBilletes > 0) {
                System.out.println(billete + " Bs: " + cantidadBilletes);
                cantidad -= cantidadBilletes * billete;
            }
        }
     }

    //Ejercicio 37

    private void Ejercicio37(){
        Scanner scanner = new Scanner(System.in);
        int A, B, C;

        System.out.print("Ingrese el lado A: ");
        A = scanner.nextInt();
        System.out.print("Ingrese el lado B: ");
        B = scanner.nextInt();
        System.out.print("Ingrese el lado C: ");
        C = scanner.nextInt();

        if (A + B > C && A + C > B && B + C > A) {
            String tipo;

            if (A == B && B == C) {
                tipo = "Equilátero";
            } else if (A == B || A == C || B == C) {
                tipo = "Isósceles";
            } else {
                tipo = "Escaleno";
            }

            double S = (A + B + C) / 2.0;
            double area = Math.sqrt(S * (S - A) * (S - B) * (S - C));

            System.out.println("El triángulo es: " + tipo);
            System.out.println("Área: " + area);
        } else {
            System.out.println("No es un triángulo.");
        }
     }

    //Ejercicio 38

    private void Ejercicio38(){
        Scanner scanner = new Scanner(System.in);
        int dia, mes;

        System.out.print("Ingrese el día de nacimiento: ");
        dia = scanner.nextInt();
        System.out.print("Ingrese el mes de nacimiento: ");
        mes = scanner.nextInt();

        String signo;

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
        } else {
            signo = "Piscis";
        }

        System.out.println("Signo del zodiaco: " + signo);
     }

    //Ejercicio 39


    private void Ejercicio39(){
        Scanner scanner = new Scanner(System.in);
        double costo;

        System.out.print("Ingrese el costo del automóvil o terreno: ");
        costo = scanner.nextDouble();

        double devaluacionAutomovil = costo * 0.50; // 50% de devaluación
        double incrementoTerreno = costo * 0.50; // Suponiendo que el terreno incrementa el mismo porcentaje

        if (devaluacionAutomovil <= incrementoTerreno) {
            System.out.println("Debe comprar el automóvil.");
        } else {
            System.out.println("No debe comprar el automóvil.");
        }
    }

    //Ejercicio 40

    private void Ejercicio40(){
        Scanner scanner = new Scanner(System.in);
        double lecturaAnterior, lecturaActual, costoPorKwh, total;

        System.out.print("Ingrese la lectura anterior: ");
        lecturaAnterior = scanner.nextDouble();
        System.out.print("Ingrese la lectura actual: ");
        lecturaActual = scanner.nextDouble();

        double consumo = lecturaActual - lecturaAnterior;

        if (consumo <= 100) {
            costoPorKwh = 2622.00;
        } else if (consumo <= 300) {
            costoPorKwh = 79.78;
        } else if (consumo <= 500) {
            costoPorKwh = 89.52;
        } else {
            costoPorKwh = 97.95;
        }

        total = consumo * costoPorKwh;
        System.out.println("Monto a pagar: " + total);
     }

    //Ejercicio 41

    private void mEjercicio41(){
        Scanner scanner = new Scanner(System.in);
        double hectareas;

        System.out.print("Ingrese la cantidad de hectáreas: ");
        hectareas = scanner.nextDouble();
        double metrosCuadrados = hectareas * 10000;

        int pinos, oyameles, cedros;

        if (metrosCuadrados > 1000000) {
            pinos = (int)(metrosCuadrados * 0.70 / 10 * 8);
            oyameles = (int)(metrosCuadrados * 0.20 / 15 * 15);
            cedros = (int)(metrosCuadrados * 0.10 / 18 * 10);
        } else {
            pinos = (int)(metrosCuadrados * 0.50 / 10 * 8);
            oyameles = (int)(metrosCuadrados * 0.30 / 15 * 15);
            cedros = (int)(metrosCuadrados * 0.20 / 18 * 10);
        }

        System.out.println("Pinos a sembrar: " + pinos);
        System.out.println("Oyameles a sembrar: " + oyameles);
        System.out.println("Cedros a sembrar: " + cedros);
     }

    //Ejercicio 42

    private void Ejercicio42(){
        Scanner scanner = new Scanner(System.in);
        double hemoglobina;
        int edad;
        String sexo;

        System.out.print("Ingrese la edad en años: ");
        edad = scanner.nextInt();
        System.out.print("Ingrese el sexo (M/F): ");
        sexo = scanner.next().toUpperCase();
        System.out.print("Ingrese el nivel de hemoglobina: ");
        hemoglobina = scanner.nextDouble();

        boolean tieneAnemia = false;

        if (edad <= 1) {
            tieneAnemia = hemoglobina < 13 || hemoglobina > 26;
        } else if (edad <= 6) {
            tieneAnemia = hemoglobina < 10 || hemoglobina > 18;
        } else if (edad <= 12) {
            tieneAnemia = hemoglobina < 11 || hemoglobina > 15;
        } else if (edad <= 5) {
            tieneAnemia = hemoglobina < 11.5 || hemoglobina > 15;
        } else if (edad <= 10) {
            tieneAnemia = hemoglobina < 12.6 || hemoglobina > 15.5;
        } else if (edad <= 15) {
            tieneAnemia = hemoglobina < 13 || hemoglobina > 15.5;
        } else if (sexo.equals("F")) {
            tieneAnemia = hemoglobina < 12 || hemoglobina > 16;
        } else if (sexo.equals("M")) {
            tieneAnemia = hemoglobina < 14 || hemoglobina > 18;
        }

        if (tieneAnemia) {
            System.out.println("La persona tiene Anemia.");
        } else {
            System.out.println("La persona no tiene Anemia.");
        }
    }

    //Ejercicio 43


    private void Ejercicio43(){
        Scanner scanner = new Scanner(System.in);
        double saldo;

        System.out.print("Ingrese el saldo actual de la empresa: ");
        saldo = scanner.nextDouble();

        double prestamo = 0;
        double nuevoSaldo;

        if (saldo < 0) {
            prestamo = 10000 - saldo;
            nuevoSaldo = 10000;
        } else if (saldo <= 20000) {
            prestamo = 20000 - saldo;
            nuevoSaldo = 20000;
        } else {
            nuevoSaldo = saldo;
        }

        double presupuesto = 5000 + 2000;
        double insumos = (presupuesto - (5000 + 2000)) / 2;
        double incentivos = insumos;

        System.out.println("Cantidad a invertir en insumos: " + insumos);
        System.out.println("Cantidad a invertir en incentivos: " + incentivos);
        if (prestamo > 0) {
            System.out.println("Cantidad a pedir prestada al banco: " + prestamo);
        }
     }

    //Ejercicio 44


    private void Ejercicio44(){
        Scanner scanner = new Scanner(System.in);
        double montoHipoteca, inversionTotal;

        System.out.print("Ingrese el monto de la hipoteca: ");
        montoHipoteca = scanner.nextDouble();
        System.out.print("Ingrese el monto total de la inversión: ");
        inversionTotal = scanner.nextDouble();

        if (montoHipoteca < 1000000) {
            double inversionSocio = montoHipoteca * 0.50;
            System.out.println("Inversión propia: " + inversionSocio);
        } else {
            double resta = inversionTotal - montoHipoteca;
            double inversionSocio = resta / 2;
            System.out.println("Inversión propia: " + montoHipoteca);
            System.out.println("Inversión del socio: " + inversionSocio);
        }
     }

    //Ejercicio 45
    private void Ejercicio45(){
        Scanner scanner = new Scanner(System.in);

        // Leer los coeficientes A, B y C
        System.out.print("Ingrese el coeficiente A: ");
        double A = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente B: ");
        double B = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente C: ");
        double C = scanner.nextDouble();

        // Calcular el discriminante
        double D = B * B - 4 * A * C;

        // Evaluar el discriminante
        if (D < 0) {
            System.out.println("No tiene solución en los reales.");
        } else if (D == 0) {
            double X1 = -B / (2 * A);
            System.out.println("La solución es: X1 = X2 = " + X1);
        } else {
            double X1 = (-B + Math.sqrt(D)) / (2 * A);
            double X2 = (-B - Math.sqrt(D)) / (2 * A);
            System.out.println("Las soluciones son: X1 = " + X1 + " y X2 = " + X2);
        }

        scanner.close();
     }
} 