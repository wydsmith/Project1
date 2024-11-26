public class NPC extends Character{
    private String friendly;
    private String enemy;
    private String neutral;
    private int Skeletons;
    private int Dragons;
    

    public NPC( String name, int age, int HP, int AP, int SP, int MP, String friendly, String enemy, String neutral, int Human, int Oob, int Elf, int Orc, int Demor, int DemiElder, int Elder, int Skeletons, int Dragons){
        super(name, age, HP, AP, SP, MP, Human, Oob, Elf, Orc, Demor, DemiElder, Elder);
        this.friendly = friendly;
        this.enemy = enemy;
        this.neutral = neutral;
    }
}



//     public void attack(){

//     }

// }
