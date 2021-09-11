package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User validUser = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                validUser = user;
                break;
            }
        }
        if (validUser == null) {
            throw new UserNotFoundException("User not valid");
        }
        return validUser;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3 || !user.isValid() || user == null) {
            throw new UserInvalidException("User not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = null;
        try {
            user = findUser(users, "Petr Arsentev");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        try {
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        }
    }
}