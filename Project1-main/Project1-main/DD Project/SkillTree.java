public class SkillTree extends CharacterClass{
    private int Charasima;
    private int Strength;
    private int Enchantment;
    private int Spells;
    private int Conjuring;
    private int Sneak;
    private int Steal;
    private int Swordskill;
    private int Archery;


    public SkillTree(String name, int age, int HP, int AP, int SP, int MP, int Human, int Elf, int Oob, int Orc, int Demor, int DemiElder, int Elder, int Warrior, int Mage, int Assassin, int Nercomancer, int Theif, int Archer, int Alchemist, int Charasima, int Strength, int Spells, int Archery, int Swordskill, int Conjuring, int Sneak, int Steal, int Enchantment){
        super(name, age, HP, AP, SP, MP, Human, Oob, Elf, Orc, Demor, DemiElder, Elder, Warrior, Assassin, Nercomancer, Theif, Archer, Alchemist, Mage);
        this.Charasima = Charasima;
        this.Enchantment = Enchantment;
        this.Strength = Strength;
        this.Spells = Spells;
        this.Conjuring = Conjuring;
        this.Sneak = Sneak;
        this.Steal = Steal;
        this.Swordskill = Swordskill;
        this.Archery = Archery;
    }
    public int getCharasima(){
        return Charasima;
    }
    public int getEnchantment(){
        return Enchantment;
    }
    public int getSpells(){
        return Spells;
    }
    public int getConjuring(){
        return Conjuring;
    }
    public int getStrength(){
        return Strength;
    }
    public int getSneak(){
        return Sneak;
    }
    public int getSwordskill(){
        return Swordskill;
    }
    public int getArchery(){
        return Archery;
    }
    public int getSteal(){
        return Steal;
    }

    // for (int i = 0; i >= 100; i++){
    //     Charasima++;
    //     Strength++;
    //     Enchantment++;
    //     Spells++;
    //     Conjuring++;
    //     Sneak++;
    //     Steal++;
    //     Swordskill++;
    //     Archery++;
    // }
}