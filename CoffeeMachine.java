package machine;

import java.util.Arrays;
import java.util.Scanner;

public class CoffeeMachine {
    private int water, milk, coffe,  dispCups, money;

    public CoffeeMachine(int water, int milk, int coffe, int dispCups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffe = coffe;
        this.dispCups = dispCups;
        this.money = money;

    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setCoffe(int coffe) {
        this.coffe = coffe;
    }

    public void setDispCups(int dispCups) {
        this.dispCups = dispCups;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffe() {
        return coffe;
    }

    public int getMoney() {
        return money;
    }

    public int getDispCups() {
        return dispCups;
    }

    @Override
    public String toString() {
        return "The coffee machine has:\r\n" +
                getWater() + " of water\r\n" +
                getMilk() + " of milk\r\n" +
                getCoffe() + " of coffe beans\r\n" +
                getDispCups() + " of disposable cups\r\n" +
                "$" + getMoney() + " of money\r\n";
    }

    public void buy() {
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int number = 0;
        /* do {
            if (input.matches("\\d")) { // it checks the input line contains only digits
                number = Integer.parseInt(input);
                //System.out.println(number + 1);
            } else {
                //System.out.println("Incorrect input: " + input);
                //System.out.println("");
            }
        }
        while ((number<1 || number>3));
        */
        if (input.matches("\\d"))
            number = Integer.parseInt(input);

        if (number == 1) espresso();
        else if (number == 2) latte();
        else if (number == 3) cappuccino();
        /*
            switch (number ) {
            case 1:  espresso(); break;
            case 2:  latte(); break;
            case 3: cappuccino(); break;
            default:  break;
            }
        */

    }

    public void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        setWater(getWater() + scanner.nextInt());
        System.out.println("Write how many ml of milk do you want to add:");
        setMilk(getMilk()+scanner.nextInt());
        System.out.println("Write how many grams of coffee beans do you want to add:");
        setCoffe(getCoffe() + scanner.nextInt());
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        setDispCups(getDispCups()+scanner.nextInt());
    }

    public void take() {
        System.out.println("I gave you $" + getMoney());
        setMoney(0);
    }

    public void espresso() {
        int useWater = 250;
        int useCoffe = 16;
        int useMoney = 4;
        int useMilk = 0;
        int useCups = 1;
        boolean enaughWater = false;
        boolean enaughCoffe = false;
        boolean enaughMoney = false;
        boolean enaughDispCups = false;
        boolean enaughMilk = false;
        String notEnaugh = "";
        if ((getWater()-useWater)>=0) {
            enaughWater = true;
        }
        else { notEnaugh = "water";}
        if ((getCoffe()-useCoffe)>=0) {
            enaughCoffe = true;
         }
        else { notEnaugh = "coffe";}
        if ((getMilk()-useMilk)>=0) {
            enaughMilk = true;
        }
        else { notEnaugh = "milk";}
        if ((getMoney()+useMoney)>=0) {
            enaughMoney = true;
        }
        else { notEnaugh = "money";}
        if ((getDispCups()-useCups)>=0) {
            enaughDispCups = true;
        }
        else { notEnaugh = "cups";}
        if (enaughWater && enaughMoney && enaughCoffe && enaughDispCups && enaughMilk) {
            System.out.println("I have enough resources, making you a coffee!");
            setWater(getWater()-useWater);
            setCoffe(getCoffe()-useCoffe);
            setMoney(getMoney()+useMoney);
            setMilk(getMilk()-useMilk);
            setDispCups(getDispCups()-useCups);
        }
        else {
            System.out.println("Sorry, not enough "+notEnaugh+"!");}
    }

    public void latte() {
        int useWater = 350;
        int useMilk = 75;
        int useCoffe = 20;
        int useMoney = 7;
        int useCups = 1;
        boolean enaughWater = false;
        boolean enaughCoffe = false;
        boolean enaughMoney = false;
        boolean enaughDispCups = false;
        boolean enaughMilk = false;
        String notEnaugh = "";
        if ((getWater()-useWater)>=0) {
            enaughWater = true;
        }
        else { notEnaugh = "water";}
        if ((getCoffe()-useCoffe)>=0) {
            enaughCoffe = true;
        }
        else { notEnaugh = "coffe";}
        if ((getMilk()-useMilk)>=0) {
            enaughMilk = true;
        }
        else { notEnaugh = "milk";}
        if ((getMoney()+useMoney)>=0) {
            enaughMoney = true;
        }
        else { notEnaugh = "money";}
        if ((getDispCups()-useCups)>=0) {
            enaughDispCups = true;
        }
        else { notEnaugh = "cups";}
        if (enaughWater && enaughMoney && enaughCoffe && enaughDispCups && enaughMilk) {
            System.out.println("I have enough resources, making you a coffee!");
            setWater(getWater()-useWater);
            setCoffe(getCoffe()-useCoffe);
            setMoney(getMoney()+useMoney);
            setMilk(getMilk()-useMilk);
            setDispCups(getDispCups()-useCups);
        }
        else {
            System.out.println("Sorry, not enough "+notEnaugh+"!");}
    }

    public void cappuccino() {
        int useWater = 200;
        int useMilk = 100;
        int useCoffe = 12;
        int useMoney = 6;
        int useCups = 1;
        boolean enaughWater = false;
        boolean enaughCoffe = false;
        boolean enaughMoney = false;
        boolean enaughDispCups = false;
        boolean enaughMilk = false;
        String notEnaugh = "";
        if ((getWater()-useWater)>=0) {
            enaughWater = true;
        }
        else { notEnaugh = "water";}
        if ((getCoffe()-useCoffe)>=0) {
            enaughCoffe = true;
        }
        else { notEnaugh = "coffe";}
        if ((getMilk()-useMilk)>=0) {
            enaughMilk = true;
        }
        else { notEnaugh = "milk";}
        if ((getMoney()+useMoney)>=0) {
            enaughMoney = true;
        }
        else { notEnaugh = "money";}
        if ((getDispCups()-useCups)>=0) {
            enaughDispCups = true;
        }
        else { notEnaugh = "cups";}
        if (enaughWater && enaughMoney && enaughCoffe && enaughDispCups && enaughMilk) {
            System.out.println("I have enough resources, making you a coffee!");
            setWater(getWater()-useWater);
            setCoffe(getCoffe()-useCoffe);
            setMoney(getMoney()+useMoney);
            setMilk(getMilk()-useMilk);
            setDispCups(getDispCups()-useCups);
        }
        else {
            System.out.println("Sorry, not enough "+notEnaugh+"!");}
    }

    public void remaining() {
        System.out.println(this.toString());
    }

    public void actionCoffe (String inputStr) {
        switch (inputStr) {
            case "buy": {
                this.buy();
                break;
            }
            case "fill": {
                this.fill();
                break;
            }
            case "take": {
                this.take();
                break;
            }
            case "remaining": {
                this.remaining();
                break;
            }
        }
    }

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550);
        Scanner scanner = new Scanner(System.in);
        String inputMsg = "";
        String exitStr = "exit";
        do {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        inputMsg = scanner.nextLine();
        if (!(inputMsg.equals(exitStr))) {
            coffeeMachine.actionCoffe(inputMsg);
        }
        else
            {System.exit(0);}
        }
        while (!inputMsg.equals(exitStr));
    }


}
