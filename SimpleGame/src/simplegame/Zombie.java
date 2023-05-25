/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplegame;

/**
 *
 * @author Aleksy
 */
public class Zombie extends monsters{

    @Override
    protected void basicStats() {
        GenerateStats generatedStaus = new GenerateStats();
        this.ap = generatedStaus.GenerateStatsAttacl(1, 5);
        this.def = generatedStaus.GenerateStatsDefence(10, 15);
        this.hp = generatedStaus.GenerateStatsHealth(10, 15);
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
}
