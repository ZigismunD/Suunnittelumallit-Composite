/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author zigis
 */
public class Client {
    public static void main(String[] args) {
        Laiteosa verkko = new Verkkokortti("verkkis", 50);
        Laiteosa kotelo = new Kotelo("paketti", 400);
        kotelo.lisaaOsa(new Prosessori("prossu", 200));
        kotelo.lisaaOsa(new Muistipiiri("muisti", 100));
        kotelo.lisaaOsa(verkko);
        kotelo.printList();
        System.out.println("Paketin yhteishinta koteloineen on " + kotelo.getHinta());
        System.out.println("");
        kotelo.poistaOsa(verkko);
        kotelo.printList();
        System.out.println("Paketin yhteishinta koteloineen on: " + kotelo.getHinta());
    }
    
}
