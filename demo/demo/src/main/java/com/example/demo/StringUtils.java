package com.example.demo;

public class StringUtils {

    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        try {

            String vowels = "";
            char[] letters = candidate.toCharArray();
            for (int i = 0; i < candidate.length(); i++) {
                if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                    vowels += letters[i];
                }
            }
            return vowels;
        } catch (NullPointerException e) {
            throw e;
        }
    }
    

     /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec des voyelles sans doublon
     */
    public static String uniqueVowels(String candidate) {
        try {
         
            String vowels = "";
            char[] letters = candidate.toCharArray();
            for (int i = 0; i < candidate.length(); i++) {
                if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                    if(vowels.indexOf(letters[i]) == -1 )
                    vowels += letters[i];
                 }
             }
             return vowels;
         } catch (NullPointerException e) {
             throw e;
         }
     }

}

