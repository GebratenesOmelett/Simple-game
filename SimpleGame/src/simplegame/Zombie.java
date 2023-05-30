/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplegame;


public class Zombie extends monsters{

    @Override
    protected void basicStats() {
        GenerateStats generatedStaus = new GenerateStats();
        this.setAp(generatedStaus.GenerateStatsAttacl(1, 5));
        this.setDef(generatedStaus.GenerateStatsDefence(10, 15));
        this.setHp(generatedStaus.GenerateStatsHealth(10, 15));
    }

    @Override
    protected void attack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected void weapon() {
       GenerateWeapon weapon = new GenerateWeapon();
        this.setAp(this.getAp() + weapon.GenerateWeapon());
    } 


    @Override
    public String toString(){
        return "Zombie";
    }

}
