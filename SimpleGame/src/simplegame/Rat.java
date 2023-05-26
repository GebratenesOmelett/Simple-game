/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplegame;


public class Rat extends monsters{

    @Override
    protected void basicStats() {
        GenerateStats generatedStaus = new GenerateStats();
        this.ap = generatedStaus.GenerateStatsAttacl(5, 10);
        this.def = generatedStaus.GenerateStatsDefence(5, 10);
        this.hp = generatedStaus.GenerateStatsHealth(5, 10);
    }

    @Override
    protected void attack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void weapon() {
        GenerateWeapon weapon = new GenerateWeapon();
        this.ap += weapon.GenerateWeapon();  
    }
    
    @Override
    protected String description() {
        return "Rat";
    }
    
}
