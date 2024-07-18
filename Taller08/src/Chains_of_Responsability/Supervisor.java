/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chains_of_Responsability;

/**
 *
 * @author ASUS VIVOBOOK PRO
 */
public class Supervisor extends RequestHandler {

    @Override
    public void handleRequest(double amount) {
        if (amount>=500 && amount <= 1000) {
            System.out.println("Supervisor aprueba la compra de $" + amount);
        } else if (next != null) {
            next.handleRequest(amount);
        }
    }
    
}
