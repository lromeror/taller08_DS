/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author ASUS VIVOBOOK PRO
 */
public class WhatsappNotification implements NotificationStrategy {
    private String phoneNumber;

    public WhatsappNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotification(double amount) {
        System.out.println("Enviando notificación por Whatsapp a " + phoneNumber+ ": Ha realizado una compra de " + amount);
    }
}
