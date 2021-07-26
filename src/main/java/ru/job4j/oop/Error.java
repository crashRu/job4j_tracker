package ru.job4j.oop;

public class Error {
    private int status;
    private boolean active;
    private String message;

    public Error() {
    }


    public Error(int status, boolean active, String message) {
        this.status = status;
        this.active = active;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error(5, true, "Мы все умрем))");
        Error error1 = new Error();
        Error error2 = new Error(2, false, "Ну не все так печально");

        System.out.println(error);
        System.out.println(error1);
        System.out.println(error2);

    }

    @Override
    public String toString() {
        return "Error{" +
                "status=" + status +
                ", active=" + active +
                ", message='" + message + '\'' +
                '}';
    }
}
