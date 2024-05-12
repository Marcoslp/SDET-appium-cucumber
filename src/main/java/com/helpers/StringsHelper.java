package com.helpers;

import java.security.SecureRandom;

public class StringsHelper {

    public static final String EMPTY_STRING = "";
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    public static final String newFirstName = "Marcos-" + StringsHelper.generateRandomString(5);
    public static String newLastName = "Test-" + StringsHelper.generateRandomString(5);

    public static String generateRandomString(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }

        return sb.toString();
    }

    public static void updateLastName(String newLastName){
        StringsHelper.newLastName = newLastName;
    }
}
