package MainContext;

import AccountManager.AccountStorageAndRepositoryImpl.InMemoryStorageTestImpl;
import UseCases.UseCaseTransferMoney;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        InMemoryStorageTestImpl accountStorage = new InMemoryStorageTestImpl();
        UseCaseTransferMoney useCase = new UseCaseTransferMoney(accountStorage);
        useCase.setAccountStorage(accountStorage);
        useCase.transferMoney(args[0], args[1], Integer.parseInt(args[2]));
    }
}
