/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplegame;

/**
 *
 * @author Aleksy
 */
public class Skeleton extends monsters{

    @Override
    protected void basicStats() {
        GenerateStats generatedStaus = new GenerateStats();
        this.ap = generatedStaus.GenerateStatsAttacl(10, 20);
        this.def = generatedStaus.GenerateStatsDefence(1, 5);
        this.hp = generatedStaus.GenerateStatsHealth(1, 5);
        
        
    }

    @Override
    protected void attack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void weapon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
