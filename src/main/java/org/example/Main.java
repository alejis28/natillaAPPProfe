package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Entradas del problema
        String nombreUsuario="alejis";
        short edadUsuario=34;
        String telefonoUsuario="3225962363";
        String documentoIdentidad="1017187878";
        int cuotaEnero;
        int cuotaFebrero;
        int cuotaMarzo;
        int cuotaAbril;
        int cuotaMayo;
        int cuotaJunio;
        int cuotaJulio;
        int cuotaAgosto;
        int cuotaSeptiembre;
        int cuotaOctubre;
        int cuotaNoviembre;
        String direccionUsuario="Cll 50# 80-20";
        double costoInscripcion=150000.0;
        float tasaInteresNatillera=0.1F;
        double saldoFinalUsuario;

        //PROCESO

        //1. Asignar un valor especifico a una variable
        //desde el TECLADO (Recibir datos)

        Scanner leerDato = new Scanner(System.in);

        System.out.println("cual es tu nombre? ");
        nombreUsuario=leerDato.nextLine();
        System.out.println("Bienvenido " + nombreUsuario);

        System.out.println("cual es su numero celular ");
        telefonoUsuario=leerDato.nextLine();
        System.out.println ("su numero de celular es: " + telefonoUsuario);

        System.out.println("numero de documento de identidad?");
        documentoIdentidad=leerDato.nextLine();
        System.out.println("su numero de identidad es:" + documentoIdentidad);

        System.out.println("cual es tu edad?");
        edadUsuario=leerDato.nextShort();
        System.out.println("tu edad es: " + edadUsuario);

        System.out.println("");





    }
}