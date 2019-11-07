package AccountManager.AccountStorageAndRepositoryImpl;

import java.util.HashMap;
import AccountManager.*;

public class InMemoryStorageTestImpl implements AccountRepository, AccountStorage {


    public HashMap<String, Account> accountMap = new HashMap<String, Account>();

    public InMemoryStorageTestImpl() {
        accountMap.put("Piotr", new Account(100, "Piotr"));
        accountMap.put("Mieszko", new Account(100, "Mieszko"));
    }

    @Override
    public Account getByName(String owner) {
        return accountMap.get(owner);
    }

    @Override
    public void updateAccount(Account accountToUpdate) {
        accountMap.put(accountToUpdate.getOwner(), accountToUpdate);
    }
}
