package JavaTwo;

import java.util.Scanner;

public class Main {

    static int hp = 100;
    static int energy = 100;
    static int power = 5;
    static int coins = 20;

    static final int MAX = 100;
    static Scanner sc = new Scanner(System.in);

    static int fireLevel = 0;
    static int waterLevel = 0;
    static int earthLevel = 0;
    static int airLevel = 0;

    static String currentElement = "Нет";
    static boolean canChangeElement = true;
    public static void main(String[] args){
        while(true){
            menu();
            int choice = readInt();

            if(choice == 1) showHero();
            else if(choice == 2) training();
            else if(choice == 3) fightOneRound();
            else if(choice == 4) rest();
            else if(choice == 5) shop();
            else if(choice == 6) studyElement();
            else if(choice == 7) break;
            else
                System.out.println("Нет такого пункта");

            if(hp == 0){
                System.out.println("Ты проиграл");
                break;
            }
            System.out.println("Выход");
    
        }
    }

    static void menu(){
        System.out.println("\n === Mini RPG Arena ===");
        System.out.println("1. Показать героя");
        System.out.println("2. Тренировка");
        System.out.println("3. Бой с монстром");
        System.out.println("4. Отдых");
        System.out.println("5. Магазин");
        System.out.println("6. Изучать стихию");
        System.out.println("7. Выход");
        System.out.print("Выбор: ");
    }
    static void studyElement() {

    if (!canChangeElement) {
        System.out.println("Сначала нужно отдохнуть, чтобы снова изучать стихии!");
        return;
    }

    if (energy < 5) {
        System.out.println("Недостаточно энергии для изучения!");
        return;
    }

    System.out.println("\n--- Выбери стихию ---");
    System.out.println("1. Огонь");
    System.out.println("2. Вода");
    System.out.println("3. Земля");
    System.out.println("4. Воздух");

    int choice = readInt("Выбор: ", 1, 4);

    switch (choice) {
        case 1 -> {
            fireLevel++;
            currentElement = "Огонь";
        }
        case 2 -> {
            waterLevel++;
            currentElement = "Вода";
        }
        case 3 -> {
            earthLevel++;
            currentElement = "Земля";
        }
        case 4 -> {
            airLevel++;
            currentElement = "Воздух";
        }
    }

    power += 1;
    energy -= 5;
    canChangeElement = false;

    normalizeStats();

    System.out.println("Ты изучил стихию " + currentElement + "!");
}

    static int readInt(){
        while(!sc.hasNextInt()){
            sc.next();
            System.out.print("Введи число: ");
        }
        int x = sc.nextInt();
        sc.nextLine();
        return x;
    }

    static int readInt(String prompt, int min, int max){
        int x;
        while(true){
            System.out.print(prompt);
            while(!sc.hasNextInt()){
                sc.next();
                System.out.print("Введи число: ");
            }
            x = sc.nextInt();
            sc.nextLine();
            if(x >= min && x <= max){
                return x;
            }
            System.out.print("Число должно быть между " + min + " и " + max + ": ");
        }
    }

    static void showHero(){
        System.out.println("\n-----Герой-----");
        System.out.println("HP: " + hp);
        System.out.println("Energy: " + energy);
        System.out.println("Power: " + power);
        System.out.println("Coins: " + coins);
        System.out.println("Текущая стихия: " + currentElement);

    System.out.println("Уровни стихий:");
    System.out.println("Огонь: " + fireLevel);
    System.out.println("Вода: " + waterLevel);
    System.out.println("Земля: " + earthLevel);
    System.out.println("Воздух: " + airLevel);

    }

    static void training(){
        int constEnergy = 10;
        if (energy < constEnergy){
            System.out.println("Не хватает энергии, нужно отдохнуть");
            return;
        }
        energy = clamp(energy - constEnergy);
        power += 5;
        System.out.println("Тренировка: -10 energy, +5 power");        
    }

    static void fightOneRound(){
        int monsterHp = 50;
        int monsterDamage = 15;

        if(energy < 10){
            System.out.println("Не хватает энергии для удара. Отдохни.");
            return;
        }
        energy = clamp(energy - 10);
        monsterHp -= power;
        if(monsterHp < 0) monsterHp = 0;
        System.out.println("Ты ударил монстра на" + power + ". HP монстра: " + monsterHp);

        if(monsterHp > 0){
            hp = clamp(hp - monsterDamage);
            System.out.println("Монстр ударил тебя на 10. Твое HP: " + hp);
        }
        else{
            coins += 3;
            System.out.println("Ты победил +3 coins");
        }
    }

    static void rest(){
        energy = clamp(energy + 5);
        hp = clamp(hp + 10);
        canChangeElement = true;
        System.out.println("Отдых: +5 energy, +10 hp");
    }


    static void shop(){
        System.out.println("\n-----Магазин-----");
        System.out.println("Coins: " + coins);
        System.out.println("1) Зелье Energy(+10) = 15 coins");
        System.out.println("2) Зелье HP(+15) = 25 coins");
        System.out.println("3) Назад");
        System.out.print("Выбор: ");

        int c = readInt();
        if(c == 1) buyEnergyPotion();
        else if (c == 2) buyHpPotion();
        else
            System.out.println("Назад");
    }

    static void buyHpPotion(){
        if(coins < 15){
            System.out.println("Не хватает деняк");
            return;
        }
        coins -= 15;
        hp = clamp(hp + 15);
        System.out.println("Купил зелье HP: +15 hp");
    }
    
    static void buyEnergyPotion(){
        if (coins < 10){
            System.out.println("Не хватает coins");
            return;
        }
        coins -= 10;
        energy = clamp(energy + 25);
        System.out.println("Купил зелье Energy: +10");
    }

    static int clamp(int v){
        if(v < 0) return 0;
        if(v > MAX) return MAX;
        return v;
    }

    static void normalizeStats(){
        hp = clamp(hp);
        energy = clamp(energy);
        power = clamp(power);
    }
}