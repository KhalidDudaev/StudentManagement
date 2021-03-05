package com.khalid.lib;

import java.util.ArrayList;
import java.util.Iterator;

public class ItemList<T> extends ArrayList<T> {
    

    /**
     *
     */
    // @java.io.Serial
    // private static final long serialVersionUID = -3732495632251044146L;

    @Override
    public String toString() {

        String res = "";

        Iterator<T> itemIterator = this.iterator();

        while(itemIterator.hasNext()) {
            res = res + itemIterator.next() + "\n"; 
        }

        return "{\n" +
            res +
            "}";
    }

}
