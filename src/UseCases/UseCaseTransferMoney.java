package UseCases;

import AccountManager.Account;
import AccountManager.AccountRepository;
import AccountManager.AccountStorage;
import AccountManager.AccountStorageAndRepositoryImpl.InMemoryStorageTestImpl;

public class UseCaseTransferMoney {

    // InstanceFields

    private AccountRepository accountRepository;
    private AccountStorage accountStorage;

    // Getters and Setters

    public AccountStorage getAccountStorage() {
        return accountStorage;
    }

    public void setAccountStorage(AccountStorage accountStorage) {
        this.accountStorage = accountStorage;
    }

    // Constructors

    // Constructor with interface accountRepository as a parameter

    public UseCaseTransferMoney(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // Public Methods

    public void transferMoney(String senderName, String receiverName, int balanceToTransfer){

        // Account repository is a interface with a method "getByName" that gets an string accountName parameter and returns AccountManager.Account object;

        Account sender = accountRepository.getByName(senderName);
        Account receiver = accountRepository.getByName(receiverName);

        try {
            sender.deduct(balanceToTransfer);
            receiver.add(balanceToTransfer);

            accountStorage.updateAccount(sender);
            accountStorage.updateAccount(receiver);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
