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
public class Verkkokortti implements Laiteosa {
    private String nimi;
    private int hinta;
    
    public Verkkokortti(String nimi, int hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
    }

    @Override
    public String getNimi() {
        return this.nimi;
    }

    @Override
    public int getHinta() {
        return this.hinta;
    }

    @Override
    public void print() {
        System.out.println(this.nimi + ", " + this.hinta);
    }

    @Override
    public void lisaaOsa(Laiteosa lo) {
        // Not supported in leaf
    }

    @Override
    public void poistaOsa(Laiteosa lo) {
        // Not supported in leaf
    }

    @Override
    public Laiteosa getChild() {
        // Not supported in leaf
        return null;
    }
    
    public void printList() {
        // Not supported in leaf
    }
    
    
    
}
