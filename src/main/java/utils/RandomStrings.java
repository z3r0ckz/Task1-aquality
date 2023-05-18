package utils;

import java.util.Random;

public class RandomStrings {

    public static String generatePassword(String email) {
        Random random = new Random();

        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numerals = "0123456789";
        String emailLetters = getEmailLetters(email);
        String cyrillicCharacters = "абвгдежзийклмнопрстуфхцчшщъыьэюя";
        StringBuilder password = new StringBuilder();
        // Add Uppercase Letter
        password.append(uppercaseLetters.charAt(random.nextInt(uppercaseLetters.length())));
        // Add a number
        password.append(numerals.charAt(random.nextInt(numerals.length())));
        // Add email letter
        password.append(emailLetters.charAt(random.nextInt(emailLetters.length())));
        // Add cyrillic characters
        password.append(cyrillicCharacters.charAt(random.nextInt(cyrillicCharacters.length())));
        // Complete the password
        int remainingLength = 10 - password.length();
        for (int i = 0; i < remainingLength; i++) {
            String availableCharacters = lowercaseLetters + uppercaseLetters + numerals + emailLetters + cyrillicCharacters;
            password.append(availableCharacters.charAt(random.nextInt(availableCharacters.length())));
        }
        return password.toString();
    }

    public static String getEmailLetters(String email) {

        StringBuilder uniqueLetters = new StringBuilder();
        for (int i = 0; i < email.length(); i++) {
            char letter = email.charAt(i);
            if (Character.isLetter(letter) && uniqueLetters.toString().indexOf(Character.toLowerCase(letter)) == -1) {
                uniqueLetters.append(Character.toLowerCase(letter));
            }
        }
        return uniqueLetters.toString();
    }

     public static String generateDomain() {
         String[] domainNames = { "gmail", "outlook", "demodomain", "sample" };
         int domainIndex = (int) (Math.random() * domainNames.length);
         return domainNames[domainIndex];
     }

    public static String generateEmail() {
        // Generar un nombre de usuario aleatorio
        String[] usernames = { "user123", "testuser", "demo_user", "user2023" };
        int index = (int) (Math.random() * usernames.length);
        return usernames[index];
    }

}

