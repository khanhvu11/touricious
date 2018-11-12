package de.hdm_stuttgart.mi;

import de.hdm_stuttgart.mi.Model.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



/**
 * A simple http://logging.apache.org/log4j/2.x demo,
 * see file resources/log4j2.xml for configuration options
 * and A1.log containing debugging output.
 */

public class App {
    private static Logger log = LogManager.getLogger(App.class);


    public static void main( String[] args ) {


        System.out.println( "Hello World!" );
        
        log.debug("You may configure 'src/main/resources/log4j2.xml' ");
        log.debug("for adapting both console and 'A1.log' file output");
    }


}