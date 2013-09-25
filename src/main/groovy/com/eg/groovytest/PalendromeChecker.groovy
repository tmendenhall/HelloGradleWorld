package com.eg.groovytest

/**
 * User: tylermendenhall
 * Date: 9/24/13
 */
class PalendromeChecker {

    public  Boolean isPalendrome(final String string){
        Boolean isPalendrome = true;

        Integer len = string.length()
        if (len <= 1){
            return false
        } else {
            char[] stringArray = string.toUpperCase().toCharArray();
            Integer endBounds = len - 1;
            for(int i = 0;i < Math.floor(stringArray.length/2);i++){
                if (!stringArray[i].equals(stringArray[endBounds - i])){
                    isPalendrome = false;
                    break;
                }
            }
        }
        return isPalendrome;
    }
}
