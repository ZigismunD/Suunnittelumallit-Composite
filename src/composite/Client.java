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
        Laiteosa prossu = new Prosessori("prossu", 100);
        Laiteosa emo = new Emolevy("emolevy", 150);
        Laiteosa muisti = new Muistipiiri("muisti", 100);
        Laiteosa naytonohjain = new Naytonohjain("näyttis", 300);
        
        emo.lisaaOsa(verkko);
        emo.lisaaOsa(prossu);
        emo.lisaaOsa(muisti);
        emo.lisaaOsa(naytonohjain);
        kotelo.lisaaOsa(emo);
        
        
        System.out.println("Komponenttien hinta:  " + emo.getHinta());
        System.out.println("");
        
        
        System.out.println("Paketin yhteishinta koteloineen on: " + kotelo.getHinta());
    }
    
}
