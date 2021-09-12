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
            throw new UserNotFoundException("User not found");
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
                new User("Petr Arsentev", false)
        };
        User user = null;
        try {
             user = findUser(users, "Petr Arsentevdd");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}