package com.lexx.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alex Corghencea on 11 June 2018.
 */
public class Sort {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();

        list.add("ela");
        list.add("guf");
        list.add("bree");

        Collections.sort(new ArrayList<String>(list));
        System.out.println(list);

    }
}
