/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplegame;

/**
 *
 * @author Aleksy
 */
public class GenerateStats{
    int GenerateStatsAttacl(int minAttack, int maxAttack){
        int randomAttack = (int)Math.floor(Math.random() * (maxAttack - minAttack + 1) + minAttack);
        return randomAttack;
    }
    int GenerateStatsDefence(int minDefence, int maxDefence){
        int randomDefence = (int)Math.floor(Math.random() * (maxDefence - minDefence + 1) + minDefence);
        return randomDefence;
    }
    int GenerateStatsHealth(int minHealth, int maxHealth){
        int randomHealth = (int)Math.floor(Math.random() * (maxHealth - minHealth + 1) + minHealth);
        return randomHealth;
    }
}
