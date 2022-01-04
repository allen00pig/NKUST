package Game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Magician Magician = new Magician("魔法師",100,30,40);//HP MP ATT
        Berserker Berserker = new Berserker("狂戰士",200,5,15);
        Archer Archer = new Archer("弓箭手",105,10,30);
        Magician.getCurrentStatus();
        Berserker.getCurrentStatus();
        Archer.getCurrentStatus();
        Scanner input=new Scanner(System.in);//建立一個Scanner物件input
        String role = "";    //宣告變數cole,用於獲取從控制檯輸入角色
        String opponent = "";//宣告變數opponent,用於獲取從控制檯選擇的對手
        String battle="";    //宣告變數battle,用於選擇對戰過程
        int number = 0;      //用於記錄回合數
        System.out.println("請選擇一個角色，並輸入角色編號：");
        System.out.println("A:狂戰士");
        System.out.println("B:弓箭手");
        System.out.println("C:魔法師");
        role = input.nextLine();//獲取玩家輸入的角色選擇
        System.out.println("請選擇一個對手，並輸入對手編號：");
        System.out.println("A:狂戰士");
        System.out.println("B:弓箭手");
        System.out.println("C:魔法師");
        opponent = input.nextLine();//獲取玩家選擇的對手
        //角色和對手不能相同
        if(role.equals(opponent)) {//字串之間的比較
            System.out.println("角色和對手不能相同,請重新選擇對手：");
            opponent = input.nextLine();//重新獲取從控制檯選擇的對手
        }
        battle = role + opponent;
        switch (battle){
            case"AB":{
                System.out.println("");
                System.out.println("狂戰士 VS 弓箭手");
                while (Berserker.Die() && Archer.Die()){
                    number++;
                    System.out.println(number+" RUN");

                }
            }
        }
    }
}
