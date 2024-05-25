package Assingment;

abstract class Bank {
    abstract int getBalance();
}

class BankX extends Bank {
    int balance = 75000;
    int getBalance() {
        return balance;
    }
}

class BankY extends Bank {
    int balance = 55000;
    int getBalance() {
        return balance;
    }
}

class BankZ extends Bank {
    int balance = 20000;
    int getBalance() {
        return balance;
    }
}

public class Program26{
    public static void main(String[] args) {
        BankX bankX = new BankX();
        BankY bankY = new BankY();
        BankZ bankZ = new BankZ();
        
        System.out.println("Bank A balance: " + bankX.getBalance());
        System.out.println("Bank B balance: " + bankY.getBalance());
        System.out.println("Bank C balance: " + bankZ.getBalance());
    }
}