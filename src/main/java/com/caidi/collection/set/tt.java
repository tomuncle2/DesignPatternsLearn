package com.caidi.collection.set;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

import java.util.*;

/**
 * @author: 蔡迪
 * @date: 22:05 2020/10/24
 * @description:
 */
public class tt {
    public static void main(String[] args) {
        Set set = new HashSet();
        HashSet hashSet = new HashSet();
        hashSet.add(null);
        hashSet.remove(null);

        // hash
        LinkedHashSet linkedHashSet  = new LinkedHashSet();
        linkedHashSet.add(null);
        linkedHashSet.remove(null);
        //
        Hashtable hashtable = new Hashtable();
        hashtable.put("dsds", null);
        //hashtable.put(null, null);

        LinkedHashMap linkedHashMap = new LinkedHashMap();
    }
}