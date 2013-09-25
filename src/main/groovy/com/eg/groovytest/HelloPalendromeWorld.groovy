package com.eg.groovytest

/**
 * User: tylermendenhall
 * Date: 9/24/13
 */
println("Yeah Baby! I am Groovy!")

def palendrome = new PalendromeChecker();

assert palendrome.isPalendrome("ABBA") == Boolean.TRUE;

assert palendrome.isPalendrome("A") == Boolean.FALSE;

assert palendrome.isPalendrome("Foo") == Boolean.FALSE;

assert palendrome.isPalendrome("Able was I ere I saw elba") == Boolean.TRUE;