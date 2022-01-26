package ru.job4j.bank;

import java.util.*;

/**
 * The class describes the operation of bank services
 *
 * @author Kirill Antokhii
 * @version 1.0
 */
public class BankService {
    /**
     * Data storage is carried out in a collection of the HashMap type
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * The method adds a new user to the system
     *
     * @param user
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * The method adds a new account to the user,
     * if the user does not find the account in
     * the system, it will not be added
     *
     * @param passport - Passport ID
     * @param account  - Account number to add to the system
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent() && !users.get(user.get()).contains(account)) {
            users.get(user.get()).add(account);
        }
    }

    /**
     * The method searches for a person in
     * the system using a passport
     *
     * @param passport -Passport ID
     * @return -Returns the found user
     * if the user is not found returns null
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst();
    }

        /**
         * The method searches for the user's details in the system,
         * the search is performed by iterating over all users,
         * returns the user, if the user is not found returns null
         * @param passport - Passport ID
         * @param requisite - User details
         * @return Account or null
         */
        public Optional<Account> findByRequisite(String passport, String requisite) {
            Optional<User> user = findByPassport(passport);
            if (user.isPresent()) {
                return users.get(user.get()).stream()
                        .filter(acc -> requisite.equals(acc.getRequisite()))
                        .findFirst();
            }
            return Optional.empty();
        }
        /**
         *The method searches for users as well as an account
         * for transfer, checks whether all conditions are suitable for transfer
         * @param srcPassport - Original passpotr
         * @param srcRequisite - Original requisite
         * @param destPassport - Account for transfer
         * @param destRequisite - transfer details
         * @param amount - price transfer
         * @return - Transfer status
         */

        public boolean transferMoney(String srcPassport, String srcRequisite,
                String destPassport, String destRequisite, double amount) {
            boolean rsl = false;
            Optional<Account> src = findByRequisite(srcPassport, srcRequisite);
            Optional<Account> dest = findByRequisite(destPassport, destRequisite);
            if (src != null && dest != null && src.get().getBalance() >= amount) {
                src.get().setBalance(src.get().getBalance() - amount);
                dest.get().setBalance(dest.get().getBalance() + amount);
                rsl = true;
            }
            return rsl;
        }
    }