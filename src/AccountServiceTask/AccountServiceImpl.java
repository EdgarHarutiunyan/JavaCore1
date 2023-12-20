package AccountServiceTask;

import java.util.Scanner;

class AccountServiceImpl implements AccountService{

    Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        for (Account acc: accounts) {
            if (acc.getOwner().getId() == id) return acc;
        }
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        long count = 0;
        for (Account acc: accounts) {
            if (acc.getBalance() > value) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User user1 = new User(1, "John", "Doe");
        User user2 = new User(2, "Jane", "Doe");
        User user3 = new User(3, "Jan", "Doe");

        Account[] accounts = {
                new Account(101, 1000, user1),
                new Account(102, 1500, user2),
                new Account(103, 2000, user3),
        };
        AccountService accountService = new AccountServiceImpl(accounts);

        long ownerIdToFind = sc.nextInt();
        Account foundAccount = accountService.findAccountByOwnerId(ownerIdToFind);
        if (foundAccount != null) System.out.println("Account found for owner id " +
                ownerIdToFind + ": " + foundAccount);
        else System.out.println("No account found for owner id " + ownerIdToFind);

        long balanceToCheck = sc.nextInt();
        long count = accountService.countAccountsWithBalanceGreaterThan(balanceToCheck);
        if (count == 0) System.out.println("No balance higher than " + balanceToCheck);
        else System.out.println("Accounts count with balance greater than " + balanceToCheck + ": " + count);
    }
}
