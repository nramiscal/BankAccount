public class BankAccountTest {

    public static void main(String [] args){
        BankAccount acct1 = new BankAccount();
        BankAccount acct2 = new BankAccount();

        acct1.deposit("checking", 100).deposit("savings", 200);
        acct2.deposit("checking", 300).deposit("savings", 400);

        System.out.println(acct1.getBalance("checking"));
        System.out.println(acct1.getBalance("savings"));
        System.out.println(acct2.getBalance("checking"));
        System.out.println(acct2.getBalance("savings"));

        acct1.withdraw("checking", 50).withdraw("savings", 50);
        acct2.withdraw("checking", 50).withdraw("savings", 50);
        System.out.println(acct1.getBalance("checking"));
        System.out.println(acct1.getBalance("savings"));
        System.out.println(acct2.getBalance("checking"));
        System.out.println(acct2.getBalance("savings"));

        BankAccount.howManyAccounts();
        BankAccount.showTotalCash();


    }
}
