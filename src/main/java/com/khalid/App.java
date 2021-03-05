package com.khalid;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import com.khalid.model.SClass;

/**
 * Hello world!
 *
 */
public class App {

    private Manager manager = new Manager();

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // System.out.println(this.toString());
    }

    public Manager manager(){
        return manager;
    }

}
