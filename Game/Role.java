package Game;

public class Role {
    int HP; //data member
    int MP; //data member
    int ATTACK; //data member
    String Skill;
    String Name;

    Role(String roleName, int roleHP, int roleMP, int roleATTACK) {
        HP = roleHP;
        MP = roleMP;
        ATTACK = roleATTACK;
        Name = roleName;
    }

    void getCurrentStatus() {
        System.out.println("Job:" + Name);
        System.out.println("Attack:" + ATTACK);
        System.out.println("HP:" + HP);
        System.out.println("MP:" + MP);
    }

    public void Duel(int ATT) {
        int residueHp;
        if (Die()) {
            residueHp = HP - ATTACK;
            System.out.println(this.Name+"受到"+ATTACK+"的傷害");
            if(residueHp <= 0)
                residueHp = 0;
            System.out.println("還剩"+residueHp+"的生命");
        }
    }

    //處裡陣亡
    public boolean Die() {
        boolean flag = true;                     //初始化，代表活著
        if (HP <= 0) {                       //生命值小於等於0則陣亡
            System.out.println(this.Name + "陣亡,遊戲結束！");
            flag = false;
        }
        return flag;                           //返回生存狀態
    }
}