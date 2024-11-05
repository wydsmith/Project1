public class Race extends Character {
    
    private int HP;
    private int AP;
    private int SP;
    private int MP;


    public Race(String name){
        super(name);
        this.HP = HP;
        this.AP = AP;
        this.SP = SP;
        this.MP = MP;
    }

    public static void Human(){
        int HP = 100;
        int AP = 33;
        int SP = 34;
        int MP = 9;
    }

    public static void Oob(){
        int HP = 50;
        int AP = 12;
        int SP = 43;
        int MP = 100;
    }
    
    public static void Elf(){
        int HP = 100;
        int AP = 23;
        int SP = 34;
        int MP = 66;

    }

    public static void Orc(){
        int HP = 200;
        int AP = 63;
        int SP = 44;
        int MP = 4;
    }

    public static void Demor(){
        int HP = 457;
        int AP = 76;
        int SP = 56;
        int MP = 88;
    }

    public static void DemiGod(){
        int HP = 500;
        int AP = 83;
        int SP = 74;
        int MP = 68;
    }

}
