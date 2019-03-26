/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zigis
 */
public class Emolevy implements Laiteosa {
    private String nimi;
    private int hinta;
    List<Laiteosa> lista;
    
    public Emolevy(String nimi, int hinta) {
        this.nimi = nimi;
        this.hinta = hinta;
        lista = new ArrayList<>();
    }

    @Override
    public String getNimi() {
        return this.nimi;
    }

    @Override
    public int getHinta() {
        int hinta = 0;
        for (Laiteosa laiteosa : lista) {
            hinta += laiteosa.getHinta();
        }
        return hinta + this.hinta;
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
        for (Laiteosa laiteosa : lista) {
            System.out.println(laiteosa.getNimi() + ", " + laiteosa.getHinta());
        }
    }

 

    
}
