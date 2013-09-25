package com.eg.groovytest

import org.junit.runner.RunWith
import org.spockframework.runtime.Sputnik
import spock.lang.Shared
import spock.lang.Specification

/**
 * User: tylermendenhall
 * Date: 9/24/13
 */
@RunWith(Sputnik.class)
class PalendromeSpock extends Specification {

    @Shared palendrome = new PalendromeChecker();

    def "Check a valid small Palendrome"() {
       expect:
            palendrome.isPalendrome("ABBA") == Boolean.TRUE

    }

    def "Check a too small string"(){
        expect:
            palendrome.isPalendrome("A") == Boolean.FALSE;

    }

    def "Test for null handling"(){
        expect:
            palendrome.isPalendrome(null) == Boolean.FALSE;
    }

    def "Test for non palendrome"() {
        expect:
            palendrome.isPalendrome("Foo") == Boolean.FALSE;
    }

    def "Test for long palendrome"() {
        expect:
            palendrome.isPalendrome("Able was I ere I saw elba") == Boolean.TRUE;
    }


}
