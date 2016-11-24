package ua.itea.less17;


import ua.itea.homework15ShapesGUI.Shape;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Администратор on 02.11.2016.
 */

class Sort implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.substring(1,2).compareTo(o2.substring(1,2));
    }
}

public class ColTreeSet {


    public static void main(String[] args){
        TreeSet<String> num = new TreeSet<String>(new Sort());
        num.add("Two");
        num.add("One");
        num.add("Zero");
        num.add("nan");
        System.out.println(num.toString());


    }
}

