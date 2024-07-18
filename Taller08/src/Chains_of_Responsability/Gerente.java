/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chains_of_Responsability;

/**
 *
 * @author ASUS VIVOBOOK PRO
 */
public class Gerente extends RequestHandler {

    @Override
    public void handleRequest(double amount) {
         if (amount > 2000) {
            System.out.println("Gerente aprueba la compra de $" + amount);
        } else if (next != null) {
            next.handleRequest(amount);
        }
    }
}
