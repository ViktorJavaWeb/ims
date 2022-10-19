package org.example.javaAdvanced.java_Collection_Framework.task4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MyClass_2 {
    private HashMap<String, String[]> map = new HashMap<>();

    public MyClass_2() {
        map.put("Раша", new String[]{"Ivanov, Petrov"});
        map.put("Київ", new String[]{"Абрамович"});
        map.put("Суми", new String[]{"Джонсони", "Mercury"});
        map.put("Лондон", new String[]{"Merlin", "Ostap Bender"});
    }

    public void findFamily(String family) {
        for (Map.Entry<String, String[]> el : map.entrySet()) {
            String[] res = el.getValue();
            if (Arrays.asList(res).contains(family)) {
                System.out.println("city - " + el.getKey());
            }

        }
    }

    public void findCity(String city) {
        String[] s = map.getOrDefault(city, new String[]{"not city"});
        System.out.println("family - " + Arrays.asList(s));
    }
}
