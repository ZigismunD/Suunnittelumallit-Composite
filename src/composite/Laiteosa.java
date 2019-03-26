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
public interface Laiteosa {
    
    public String getNimi();
    public int getHinta();
    public void print();
    public void lisaaOsa(Laiteosa lo);
    public void poistaOsa(Laiteosa lo);
    public Laiteosa getChild();
    public void printList();
}
