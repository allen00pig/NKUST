public class JOP {
    int Att;
    int HP;
    int MP;
    String Job;

    String getJob(){
        return this.Job;
    }

    int getHP(){
        return this.HP;
    }

    int getMP(){
        return this.MP;
    }
    int getAtt(){
        return this.Att;
    }
    void sayItJop(){
        System.out.println("Jop is " + getJob());
    }


}
