package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

/**
 */

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        System.out.println(userService.getAllUsers());

    }


}
