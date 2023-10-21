package Lesson8;

public class BankAccount {
    int idAccount;
    int accountMany;

    BankAccount(){

    }
    BankAccount(int id, int aM){
        idAccount = id;
        accountMany = aM;
        System.out.println("Создался банковский аккаунт " + id + " " + accountMany);
    }

}
