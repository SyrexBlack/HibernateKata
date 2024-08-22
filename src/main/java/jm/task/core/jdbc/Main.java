package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        try {
            userService.createUsersTable();

            userService.saveUser("Мария", "Богданова", (byte) 19);
            userService.saveUser("Лиза", "Иванова", (byte) 23);
            userService.saveUser("Егор", "Мелузов", (byte) 20);
            userService.saveUser("Игорь", "Брусницын", (byte) 35);

            userService.getAllUsers().forEach(user -> System.out.println(user));

            userService.cleanUsersTable();
            userService.dropUsersTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
