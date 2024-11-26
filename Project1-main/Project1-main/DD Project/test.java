import java.util.Scanner;
//import java.util.stream.Collector.Characteristics;

import javax.management.RuntimeErrorException;

//import java.util.Random;
import java.util.*;
//import junit.org.*;

//import org.junit.*;

public class test{
    /**
     * @param args
     */



    public static String name = "";
    public static int age = 0;
    public static int HP = 0;
    public static int AP = 0;
    public static int SP = 0;
    public static int MP = 0;
    public static int Human;
        public static int Oob;
        public static int Elf;
        public static int Orc;
        public static int Demor;
        public static int DemiElder;
        public static int Elder;
        public static int race;
        public static int Warrior;
        public static int Mage;
        public static int Assassin;
        public static int Archer;
        public static int Nercomancer;
        public static int Theif;
        public static int Alchemist;
        public static String Special_Skills;
        public static int SSP;
        public static String Special_Skills2;
        public static int SSP2;
        public static int Charasima;
        public static int Strength;
        public static int Enchantment;
        public static int Spells;
        public static int Conjuring;
        public static int Sneak;
        public static int Steal;
        public static int Swordskill;
        public static int Archery;
        public static String SkillName;
        public static int Skill1;
        public static int Skill2;
        public static int Skill3;
        Character player = new Character( name, age, HP, AP, SP, MP, Human, Elf, Oob, Orc, Demor, DemiElder, Elder);
        CharacterClass classes = new CharacterClass(name, age, HP, AP, SP, MP, Human, Elf, Oob, Orc, Demor, DemiElder, Elder, Mage, Warrior, Nercomancer, Assassin, Theif, Archer, Alchemist);
        SkillTree playerSkill = new SkillTree(name, age, HP, AP, SP, MP, Human, Elf, Oob, Orc, Demor, DemiElder, DemiElder, Warrior, Mage, Assassin, Nercomancer, Theif, Archer, Alchemist, Charasima, Strength, Spells, Archery, Swordskill, Conjuring, Sneak, Steal, Enchantment);
        public static void main(String[] args){


    //Character player = new Character( name, age, HP, AP, SP, MP, Human, Elf, Oob, Orc, Demor, DemiElder, Elder);
    Scanner scnn = new Scanner(System.in);
    System.out.println("Enter your Character's name:");
    name = scnn.nextLine();
    System.out.println("Hello " + name + ", welcome to DD!");
    System.out.println("\n");
    System.out.println("__________________________________________");
    System.out.println("How old is your character: ");
    age = scnn.nextInt();
    System.out.println(name + " is, "+ age);
    System.out.println("\n");
    System.out.println("__________________________________________");
    System.out.println("Choose a race!: ");
    System.out.println("1. Human - HP: 100, SP: 34 , AP: 33 , MP: 9 ");
    System.out.println("2. Oob - HP: 50, SP: 43, AP: 12, MP: 100 ");
    System.out.println("3. Elf - HP: 100, SP: 34 , AP: 23 , MP: 66 ");
    System.out.println("4. Orc - HP: 200, SP: 44, AP: 63, MP: 4 ");
    System.out.println("\n");
    System.out.println("__________________________________________");

    race = scnn.nextInt();

    if (race == 1){
        System.out.println(name + " is an, " + "Human");
        HP = 400;
        SP = 34;
        AP = 33;
        MP = 9;
        Special_Skills = "Battle Adreniline";
        SSP = AP + 200;
        AP = SSP;
    }  else if(race == 3){
        System.out.println(name + " is an, " + "Elf");
        HP = 400;
        SP = 34;
        AP = 33;
        MP = 66;
        Special_Skills = "Archer's Sight";
        SSP = AP + 65;
        AP = SSP;

    } else if(race == 2){
        System.out.println(name + " is an, " + "Oob");
        HP = 350;
        SP = 43;
        AP = 12;
        MP = 100;
        Special_Skills = "Magic Blast";
        SSP = AP + 234;
        AP = SSP;
    } else if(race == 4){
        System.out.println(name + " is an, " + "Orc");
        HP = 500;
        SP = 44;
        AP = 63;
        MP = 4;
        Special_Skills = "Brute Force";
        SSP = AP + 400;
        AP = SSP;
    } else if(race == 5){
        System.out.print("CHEAT MODE!!!!!");
        System.out.println(name + " is an, " + "Demor");
        HP = 5000;
        SP = 5000;
        AP = 5000;
        MP = 5000;
        Special_Skills = "Demon Curse";
        SSP = AP + 3000;
        AP = SSP;
    }  else if(race == 6){
        System.out.print("CHEAT MODE!!!!!");
        System.out.println(name + " is an, " + "Elder");
        HP = 5000;
        SP = 5000;
        AP = 5000;
        MP = 5000;
        Special_Skills = "Elder Wisdom";
        SSP = AP + 3000;
        AP = SSP;
    } else if(race == 7){
        System.out.print("CHEAT MODE!!!!!");
        System.out.println(name + " is an, " + "Demi-Elder");
        HP = 2000;
        SP = 2000;
        AP = 2000;
        MP = 2000;
        Special_Skills = "Half-Breed's Luck";
        SSP = AP + 6000;
        AP = SSP;
    }
    else {
        throw new RuntimeErrorException(null, "Please Try again!");
    }
    System.out.println("\n");
    System.out.println("__________________________________________");
    System.out.println("Player Stats!!!!!");
    System.out.println("Special Skill: " + Special_Skills);
    System.out.println("Health Points = " + HP);
    System.out.println("Attack Points = " + AP);
    System.out.println("Stanima Points = " + SP);
    System.out.println("Magic Points = " + MP);

    System.out.println("\n");
    System.out.println("__________________________________________");
    //CharacterClass classes = new CharacterClass(name, age, HP, AP, SP, MP, Human, Elf, Oob, Orc, Demor, DemiElder, Elder, Mage, Warrior, Nercomancer, Assassin, Theif, Archer, Alchemist);
    System.out.println("Choose a Character Class");
    System.out.println("1. Warrior");
    System.out.println("2. Mage");
    System.out.println("3. Assassin");
    System.out.println("4. Archer");
    System.out.println("5. Theif");
    System.out.println("6. Necromancer");
    System.out.println("7. Alchemist");
    
    System.out.println("\n");
    System.out.println("__________________________________________");

    int classes = scnn.nextInt();
    if(classes == 1){
        System.out.println(name + " is a, Warrior" );
        HP = HP + 400;
        SP = SP + 30;
        AP = AP + 58;
        MP = MP - 4;
        Special_Skills2 = "Warriors Resolve";
        SSP2 = AP + 219;
        AP = SSP2;
        SkillName = "Swordskill, Strength, Charasmia";
        Skill1 = 100;
        Skill2 = 100;
        Skill3 = 100;
    } else if(classes == 2){
        System.out.println(name + " is a, Mage" );
        HP = HP + 350;
        SP = SP + 10;
        AP = AP - 2;
        MP = MP + 200;
        Special_Skills2 = "Magic Storm";
        SSP2 = AP + 310;
        AP = SSP2;
        SkillName = "Spells, Enchantment, Strength";
        Skill1 = 100;
        Skill2 = 100;
        Skill3 = 100;
    } else if(classes == 3){
        System.out.println(name + " is an, Assassin" );
        HP = HP + 263;
        SP = SP + 58;
        AP = AP + 6;
        MP = MP + 18;
        Special_Skills2 = "Assassin's Creed";
        SSP2 = AP + 150 ;
        AP = SSP2;
        SkillName = "Swordskill, Sneak, Charasmia";
        Skill1 = 100;
        Skill2 = 100;
        Skill3 = 100;
    } else if(classes == 4){
        System.out.println(name + " is an, Archer" );
        HP = HP + 177;
        SP = SP + 23;
        AP = AP + 50;
        MP = MP + 5;
        Special_Skills2 = "Arrow Fire Storm";
        SSP2 = AP + 180 ;
        AP = SSP2;
        SkillName = "Archery, Strength, Spells";
        Skill1 = 100;
        Skill2 = 100;
        Skill3 = 100;
    } else if(classes == 5){
        System.out.println(name + " is an, Theif" );
        HP = HP + 145;
        SP = SP + 68;
        AP = AP - 4;
        MP = MP + 23;
        Special_Skills2 = "Quick Getaway";
        SSP2 = SP + 254 ;
        SP = SSP2;
        SkillName = "Steal, Sneak, Charasmia";
        Skill1 = 100;
        Skill2 = 100;
        Skill3 = 100;

    } else if(classes == 6){
        System.out.println(name + " is an, Nercomancer" );
        HP = HP + 120;
        SP = SP + 32;
        AP = AP + 8;
        MP = MP + 98;
        Special_Skills2 = "Deadman's Army";
        SSP2 = MP + 456 ;
        MP = SSP2;
        SkillName = "Conjuring, Spell, Strength";
        Skill1 = 100;
        Skill2 = 100;
        Skill3 = 100;
    } else if(classes == 7){
        System.out.println(name + " is an, Alchemist" );
        HP = HP + 130;
        SP = SP + 6;
        AP = AP + 6;
        MP = MP + 95;
        Special_Skills2 = "Alchemist Circle";
        SSP2 = AP + 120 ;
        AP = SSP2;
        SkillName = "Enchantment, Spell, Conjuring";
        Skill1 = 100;
        Skill2 = 100;
        Skill3 = 100;
    } else{
        throw new RuntimeErrorException(null,"Please Try Again!");
    }
    
    System.out.println("\n");
    System.out.println("__________________________________________");

    System.out.println("Player Stats Updated!");
    System.out.println("Player Skills: " + SkillName);
    System.out.println("Special Skill: " + Special_Skills);
    System.out.println("Special Skill: " + Special_Skills2);
    System.out.println("Health Points = " + HP);
    System.out.println("Attack Points = " + AP);
    System.out.println("Stanima Points = " + SP);
    System.out.println("Magic Points = " + MP);

    System.out.println("\n");
    System.out.println("__________________________________________");

    System.out.println("You're a Prisoner of an high security prison! You look through the bars and hear the guards yelling and shouting.");
    System.out.println("Guard 1: Forlock has Escape! Summon the High Mages at once!");
    System.out.println("Boom.....");
    System.out.println("Your Cell wall has been Destroy! As the dust starts to settle you start to see a shadow figure");
    System.out.println("Shadow Figure: Come with me if you want to leave this place!");
    System.out.println("Will you go with this mysterious figure!");
    System.out.println("1. Yes");
    System.out.println("2. No");
    int choice1 = scnn.nextInt();

    if(choice1 == 1){
        System.out.println("You go with this mysterious man!");
    } else if (choice1 == 2){
        System.out.println("You do not go with the mysterious man!");
    }




    }



}