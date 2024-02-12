package org.example;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String nombreUsuario,
                nombreUsuarioBD = "pepe",
                contrasena,
                contrasenaBD = "123",
                opcion;

        int saldo = 1000000,
                transferir,
                intentos = 0,
                retirar,
                numeroCuenta,
                consignar;

        Scanner leerDato = new Scanner(System.in);

                    //inicio de sesión
            do {


                System.out.print("Bienvenido\n Banco bbva el banco de los Polombianos inicie sesión\n Nombre de usuario");
                nombreUsuario = leerDato.nextLine();
                if (nombreUsuario.equals("pepe")){

                if (nombreUsuario.equals(nombreUsuarioBD)) {
                    System.out.print("Bienvenido" + nombreUsuario + "por favor digite su contraseña");
                    contrasena = leerDato.nextLine();

                    if (contrasena.equals(contrasenaBD)) {
                        System.out.print("que desea hacer?\n1.consultar saldo\n2.retirar saldo\n3.consignar saldo\n4.transferir saldo\nMARQUE CON SU RESPECTIVO NUMERO");
                        opcion=leerDato.nextLine();

                        //opcion 1

                        if (opcion.equals("1")) {
                            System.out.print("su saldo es de"+saldo);

                         //opcion 2
                        } else if (opcion.equals("2")) {
                            System.out.print("digite la cantidad a retirar");
                            retirar=leerDato.nextInt();
                            if (retirar<=saldo){
                                saldo=saldo-retirar;
                                System.out.printf("su retiro ha sido realizado con exito!, su saldo es de "+saldo);
                            }else{
                                System.out.print("fondos insuficientes ");}

                            //opcion 3

                        } else if (opcion.equals("3")) {
                            System.out.printf("ingrese la cantidad a consignar");
                            consignar=leerDato.nextInt();
                            saldo=saldo+consignar;
                            System.out.print("ahora su saldo es de "+saldo);

                            //opcion 4
                        } else if (opcion.equals("4")) {

                            System.out.print("digite el numero de la cuenta a la que decea enviar su dinero");
                            numeroCuenta=leerDato.nextInt();
                            System.out.printf("ingrese la cantidad de dinero que desea transferir, recuerde que su saldo es de "+saldo);
                            transferir=leerDato.nextInt();
                            if (transferir<=saldo){
                             saldo= saldo-transferir;
                                System.out.printf("transferencia exitosa su nuevo saldo es de "+saldo);
                            }else {
                                System.out.print("fondos insuficientes recuerde que su saldo es de"+saldo);
                            }
                        } else {
                         System.out.print("usuario incorrecto por favor digite de nuevo su nombre de usuario");}
                    }else {
                        intentos = intentos + 1;}
                    }
                }
            }while (intentos< 3);
             System.out.print("Demaciados intentos, intentelo mas tarde");
    }
}