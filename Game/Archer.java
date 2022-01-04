package Game;

public class Archer extends Role{
    int Att;
    int HP;
    int MP;
    String Chant;
    String Name;

    Archer(String roleName, int roleHP, int roleMP, int roleATTACK) {
        super(roleName,roleHP, roleMP, roleATTACK);
    }
}
