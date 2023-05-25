/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplegame;


public class SimpleGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        monsters newmonster = new Skeleton();
        newmonster.basicStats();
        newmonster.weapon();
        System.out.println(newmonster.ap);
    }
    
    
}
abstract class monsters{
    protected int ap;
    protected int hp;
    protected int def;
    protected abstract void basicStats();
    protected abstract void attack();
    protected abstract void weapon();
}

    

