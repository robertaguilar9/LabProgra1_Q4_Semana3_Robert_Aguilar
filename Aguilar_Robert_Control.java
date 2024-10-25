/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aguilar_robert_control;

import java.util.Scanner;

/**
 *
 * @author Selvin Aguilar
 */
public class Aguilar_Robert_Control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        while (true){
            System.out.println("-----MENU | LAB PROGRA 1 | SEMANA 3-----"+
                    "\n1. CADENA"+
                    "\n2. NOTAS"+
                    "\n3. CLASES"+
                    "\n4. SALIR"+
                    "\n- Elige una opcion: ");
            int menu=lea.nextInt();
            
            if(menu==1){
                int conta = 0, num_letras = 0, cont_max = 0;
                char conteo = 0, caracter_max = 0;

                System.out.println("Ingrese la cadena de caracteres: ");
                lea.nextLine();
                String input = lea.nextLine();

                num_letras = input.length();

                while (conteo < 256) {
                    int conteo1 = 0;
                    int conta_caracter = 0;

                    while (conta_caracter < num_letras) {
                        if (input.charAt(conta_caracter) == conteo) {
                            conteo1++;
                        }
                        conta_caracter++;
                    }
                    if (conteo1 > cont_max) {
                        cont_max = conteo1;
                        caracter_max = conteo;
                    }
                    conteo++;
                }

                System.out.println("El caracter que mas se repite es: " + caracter_max);
                System.out.println("Numero de veces que se repite: " + cont_max);
                System.out.println("                             ");
                
            } else if(menu==2){
                System.out.println("Ingrese la cantidad de notas:");
            int cant_notas = lea.nextInt();

            double suma = 0;
            double nota_mayor = -1;
            double nota_menor = 101;

            int i = 0;
            while (i < cant_notas) {
            System.out.println("Ingrese la nota " + (i + 1) + " (0 a 100):");
            double nota = lea.nextDouble();

            while (nota < 0 || nota > 100) {
                System.out.println("Nota inválida. Ingrese la nota " + (i + 1) + " (0 a 100):");
                nota = lea.nextDouble();
            }

            suma += nota;
            if (nota > nota_mayor) {
                nota_mayor = nota;
            }
            if (nota < nota_menor) {
                nota_menor = nota;
            }

            i++;
        }

            double promedio = suma / cant_notas;

            System.out.printf("Promedio de las notas: %.2f%n", promedio);
            System.out.println("Nota mayor: " + nota_mayor);
            System.out.println("Nota menor: " + nota_menor);
                System.out.println("                       ");
        
            } else if(menu==3){
            while (true) {
                    String fecha;
                    System.out.println("Ingrese la fecha (dia,DD/MM)");
                    fecha = lea.next();
                    String dia = fecha.substring(fecha.indexOf(',') + 1, fecha.indexOf('/')).trim();
                    String mes = fecha.substring(fecha.indexOf('/') + 1);
                    String dia_sem = fecha.substring(0, fecha.indexOf(',')).trim().toLowerCase();
                    int mes_entero = Integer.parseInt(mes);
                    int dia_entero = Integer.parseInt(dia);

                    if (mes_entero > 0 && mes_entero < 13 && dia_entero > 0 && dia_entero < 32) {
                        if (dia_sem.equals("lunes") || dia_sem.equals("martes") || dia_sem.equals("miercoles")) {
                            while (true) {
                                System.out.println("Se tomaron examenes ese dia? (SI/NO): ");
                                String exam = lea.next().toLowerCase();

                                if (exam.equals("si")) {
                                    System.out.print("Alumnos Aprobados: ");
                                    int aprobados = lea.nextInt();
                                    System.out.print("Alumnos Desaprobados: ");
                                    int desaprobados = lea.nextInt();

                                    int total_alumnos = aprobados + desaprobados;
                                    double porcentajeAlumnos = (aprobados / (double) total_alumnos) * 100;

                                    System.out.printf("El porcentaje de alumnos aprobados es : %.2f%%\n", porcentajeAlumnos);
                                    break;
                                } else if (exam.equals("no")) {
                                    break;
                                } else {
                                    System.out.println("Entrada invalida. Intente de nuevo.");
                                }
                            }
                        } else if (dia_sem.equals("jueves")) {
                            while (true) {
                                System.out.print("Porcentaje de asistencia: ");
                                double asistencia = lea.nextDouble();
                                if (asistencia >= 0 && asistencia <= 100) {
                                    System.out.println(asistencia > 50 ? "Asistio la mayoria." : "No asistio la mayoria.");
                                    break;
                                } else {
                                    System.out.println("Porcentaje invalido. Intente de nuevo.");
                                }
                            }
                        } else if (dia_sem.equals("viernes")) {
                            if ((dia_entero == 1 && (mes_entero == 1 || mes_entero == 7))) {
                                while (true) {
                                    System.out.print("Alumnos nuevos: ");
                                    int alumnos = lea.nextInt();
                                    System.out.print("Precio por alumno: ");
                                    double precio = lea.nextDouble();
                                    if (alumnos >= 0 && precio >= 0) {
                                        System.out.printf("Ingreso total: $%.2f\n", alumnos * precio);
                                        break;
                                    } else {
                                        System.out.println("Entrada invalida. Intente de nuevo.");
                                    }
                                }
                            }
                        }
                        break;
                    } else {
                        System.out.println("Se produjo un error (Fecha Incorrecta). Intente de nuevo.");
                        }
                }
        }
            }
        }
        
    }
    

