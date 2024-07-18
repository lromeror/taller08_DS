/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author ASUS VIVOBOOK PRO
 */
public class CustomerObserver extends Observer {
    private String customerEmail;

    public CustomerObserver(Subject subject, String customerEmail) {
        this.subject = subject;
        this.customerEmail = customerEmail;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Notificando a " + customerEmail + ": Nueva oferta disponible: " + subject.getOffer());
    }
}
