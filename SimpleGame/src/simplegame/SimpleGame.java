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
        System.out.println(randomMonster.lengthGame);
        
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


class randomMonster{
    public final static int lengthGame = 10;
    int[] amountMonsters = new int[lengthGame];
    
    
    int monsterDraw(){
        for(int x = 0; x < lengthGame; x++){
            Double monsterRandom = Math.random();
            if(monsterRandom >= 0.7){
            }
            else if(monsterRandom >= 0.4 && monsterRandom < 0.7){
            return 5; //stick
            }
            return 1; //fist
        }
        return 0;
    }
}

    



    

