/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chains_of_Responsability;

/**
 *
 * @author ASUS VIVOBOOK PRO
 */
public abstract class RequestHandler {
    protected RequestHandler next;
    public static RequestHandler link(RequestHandler first, RequestHandler... chain) {
        RequestHandler head = first;
        for (RequestHandler nextInChain : chain) {
            head.setNext(nextInChain);
            head = nextInChain;
        }
        return first;
    }
    public void setNext(RequestHandler nextH){
        this.next=nextH;
    }
    public abstract void handleRequest(double amount);
}
