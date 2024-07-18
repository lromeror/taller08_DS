/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller08;

import Chains_of_Responsability.*;
import Observer.*;
import Strategy.*;
import java.util.Scanner;

/**
 *
 * @author ASUS VIVOBOOK PRO
 */
public class Taller08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Chain of Responsability
        // Creación de los manejadores
        RequestHandler automaticApproval = new Automatic();
        RequestHandler supervisor = new Supervisor();
        RequestHandler subgerente = new SubGerente();
        RequestHandler gerente = new Gerente();

        // Configuración de la cadena de responsabilidad usando la función link
        RequestHandler chain = RequestHandler.link(automaticApproval, supervisor, subgerente, gerente);

        // Ejemplo de solicitudes
        double[] solicitudes = {450, 1500, 2300};

        for (double solicitud : solicitudes) {
            chain.handleRequest(solicitud);
        }
        //Observer
        Subject subject = new Subject();

        // Crear los observadores (clientes suscritos)
        CustomerObserver customer1 = new CustomerObserver(subject, "cliente1@tienda.com");
        CustomerObserver customer2 = new CustomerObserver(subject, "cliente2@tienda.com");

        // Cambiar el estado del subject (nueva oferta)
        subject.setOffer("Acceso a sala VIP en el cine");
        subject.setOffer("Descuento del 20% en productos de hogar");
        //Strategy
        NotificationContext context = new NotificationContext();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el mecanismo de notificación:");
        System.out.println("1. Orkut");
        System.out.println("2. Facebook");
        System.out.println("3. Twitter");
        System.out.println("4. Whatsapp");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Ingrese el nombre de usuario de Orkut:");
                String orkutUser = scanner.next();
                context.setStrategy(new OrkutNotification(orkutUser));
                break;
            case 2:
                System.out.println("Ingrese el nombre de usuario de Facebook:");
                String facebookUser = scanner.next();
                context.setStrategy(new FacebookNotification(facebookUser));
                break;
            case 3:
                System.out.println("Ingrese el nombre de usuario de Twitter:");
                String twitterUser = scanner.next();
                context.setStrategy(new TwitterNotification(twitterUser));
                break;
            case 4:
                System.out.println("Ingrese el número de Whatsapp:");
                String whatsappNumber = scanner.next();
                context.setStrategy(new WhatsappNotification(whatsappNumber));
                break;
            default:
                System.out.println("Selección inválida");
                return;
        }

        System.out.println("Ingrese el monto de la compra:");
        double amount = scanner.nextDouble();
        context.executeStrategy(amount);

        scanner.close();
    }
    
}
