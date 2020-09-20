package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static int water = 400;
    public static int milk = 540;
    public static int coffeeBeans = 120;
    public static int disposableCups = 9;
    public static int money = 550;


    public static int getWater() {
        return water;
    }

    public static void setWater(int water) {
        CoffeeMachine.water = water;
    }

    public static int getMilk() {
        return milk;
    }

    public static void setMilk(int milk) {
        CoffeeMachine.milk = milk;
    }

    public static int getCoffeeBeans() {
        return coffeeBeans;
    }

    public static void setCoffeeBeans(int coffeeBeans) {
        CoffeeMachine.coffeeBeans = coffeeBeans;
    }

    public static int getDisposableCups() {
        return disposableCups;
    }

    public static void setDisposableCups(int disposableCups) {
        CoffeeMachine.disposableCups = disposableCups;
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        CoffeeMachine.money = money;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean actionCondition = true;
        while (actionCondition) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = sc.nextLine();
            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    actionCondition = false;
                    break;
            }
        }
    }

    public static void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(getWater() + " of water");
        System.out.println(getMilk() + " of milk");
        System.out.println(getCoffeeBeans() + " of coffee beans");
        System.out.println(getDisposableCups() + " of disposable cups");
        System.out.println(getMoney() + " of money");
    }

    public static void buy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String action = sc.nextLine();
        switch (action) {
            case "1":
                if (getWater() < 250) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (getCoffeeBeans() < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else {
                    setWater(getWater() - 250);
                    setCoffeeBeans(getCoffeeBeans() - 16);
                    setMoney(getMoney() + 4);
                    setDisposableCups(getDisposableCups() - 1);
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "2":
                if (getWater() < 350) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (getMilk() < 75) {
                    System.out.println("Sorry not enough milk!");
                    break;
                } else if (getCoffeeBeans() < 20) {
                    System.out.println("Sorry not enough coffee beans!");
                    break;
                } else {
                    setWater(getWater() - 350);
                    setMilk(getMilk() - 75);
                    setCoffeeBeans(getCoffeeBeans() - 20);
                    setMoney(getMoney() + 7);
                    setDisposableCups(getDisposableCups() - 1);
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "3":
                if (getWater() < 200) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (getMilk() < 100) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else if (getCoffeeBeans() < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else {
                    setWater(getWater() - 200);
                    setMilk(getMilk() - 100);
                    setCoffeeBeans(getCoffeeBeans() - 12);
                    setMoney(getMoney() + 6);
                    setDisposableCups(getDisposableCups() - 1);
                    System.out.println("I have enough resources, making you a coffee!");
                }
                break;
            case "back":
                break;
        }
    }

    public static void fill() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        setWater(getWater() + sc.nextInt());
        System.out.println("Write how many ml of milk do you want to add:");
        setMilk(getMilk() + sc.nextInt());
        System.out.println("Write how many grams of coffee beans do you want to add:");
        setCoffeeBeans(getCoffeeBeans() + sc.nextInt());
        System.out.println("Write how many disposable cups of coffee do you want to add");
        setDisposableCups(getDisposableCups() + sc.nextInt());
    }

    public static void take() {
        System.out.printf("I gave you $%d", getMoney());
        setMoney(0);
    }
}
