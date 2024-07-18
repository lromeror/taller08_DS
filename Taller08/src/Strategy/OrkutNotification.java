/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author ASUS VIVOBOOK PRO
 */
public class OrkutNotification implements NotificationStrategy {
    private String userName;

    public OrkutNotification(String userName) {
        this.userName = userName;
    }

    @Override
    public void sendNotification(double amount) {
        System.out.println("Enviando notificación por Orkut a " + userName + ": Ha realizado una compra de " + amount);
    }
}
