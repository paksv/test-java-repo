package tcdemo;

import java.util.Comparator;

/**
 * Created by Sergey.Pak on 11/25/2015.
 */
public class LinuxPathComparer implements Comparator<String> {

    public int compare(String s1, String s2) {
        if (s1==null){
            return s2 == null ? 0 : -1;
        } else {
            return s2 == null ? 1: s1.compareTo(s2);
        }
    }
}
