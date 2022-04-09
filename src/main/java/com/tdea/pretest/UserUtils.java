package com.tdea.pretest;

public class UserUtils {
    public static boolean isPasswordEqual(String dbPassword, String password) {
        return dbPassword.equals(password);
    }
}
