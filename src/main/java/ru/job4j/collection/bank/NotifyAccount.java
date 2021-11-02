package ru.job4j.collection.bank;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rls = new HashSet<>();
        for (Account ac : accounts) {
            rls.add(ac);
        }
        return rls;
    }
}
