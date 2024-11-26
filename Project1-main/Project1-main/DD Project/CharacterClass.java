public class CharacterClass extends Character{

    private int Warrior;
    private int Mage;
    private int Assassin;
    private int Archer;
    private int Theif;
    private int Nercomancer;
    private int Alchemist;

    public CharacterClass(String name, int age, int HP, int AP, int SP, int MP, int Human, int Elf, int Oob, int Orc, int Demor, int DemiElder, int Elder, int Warrior, int Mage, int Assassin, int Nercomancer, int Theif, int Archer, int Alchemist){
        super(name, age, HP, AP, SP, MP, Human, Oob, Elf, Orc, Demor, DemiElder, Elder);
        this.Warrior = Warrior;
        this.Mage = Mage;
        this.Assassin = Assassin;
        this.Archer = Archer;
        this.Theif = Theif;
        this.Nercomancer = Nercomancer;
        this.Alchemist = Alchemist;
    }
    public int getWarrior() {
        return Warrior;
    }
    public int getMage(){
        return Mage;
    }
    public int getAssassin(){
        return Assassin;
    }
    public int getArcher(){
        return Archer;
    }
    public int getTheif(){
        return Theif;
    }
    public int getNercomancer(){
        return Nercomancer;
    }
    public int getAlchemist(){
        return Alchemist;
    }



}
