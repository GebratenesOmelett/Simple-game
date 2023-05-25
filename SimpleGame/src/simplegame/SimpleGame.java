/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplegame;

/**
 *
 * @author Aleksy
 */
public class SimpleGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int random_int = (int)Math.floor(Math.random() * (15 - 2 + 1) + 2);
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

    

