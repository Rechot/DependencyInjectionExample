package AccountManager;

import AccountManager.Account;

public interface AccountRepository {
    // Method that takes a string ownerAccount parameter
    // and returns an AccountManager.Account object .
    public Account getByName(String owner);
}
