package AccountManager;

import AccountManager.Account;

public interface AccountStorage {
    // A method that gets updates AccountManager.Account passed as a parameter
    public void updateAccount(Account accountUpdate);
}
