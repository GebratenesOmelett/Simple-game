/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplegame;


public class GenerateWeapon {
    Double randomWeapon = Math.random();
    
    int GenerateWeapon(){
        if(randomWeapon >= 0.8){
            return 10; //sword
        }
        else if(randomWeapon >= 0.5 && randomWeapon < 0.8){
            return 5; //stick
        }
        return 1; //fist
    }
}
