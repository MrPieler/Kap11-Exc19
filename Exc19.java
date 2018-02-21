package Exc19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exc19
{
    public static void main(String[] args)
    {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Bent", 2);
        map1.put("Søren", 3);
        map1.put("Ole", 2);
        map1.put("John", 5);
        map1.put("Jens", 5);
        map1.put("Henning", 1);
        map1.put("Henrik", 3);
        map1.put("Birthe", 1);

        System.out.println(rarest(map1));

    }

    private static Integer rarest(Map<String, Integer> map)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        Integer smallest = 999;
        Integer smallestKey = 0;
        list1.addAll(map.values());
        Map<Integer, Integer> map1 = new HashMap<>();
        for (Integer i : list1)
        {
            map1.put(i, 0);
        }
        for (Integer i : list1)
        {
            map1.put(i, map1.get(i) + 1);
        }

        for (Map.Entry<Integer, Integer> e:map1.entrySet())
        {
            if (e.getValue() < smallest)
            {
                smallest = e.getValue();
                smallestKey = e.getKey();
            }
            else if (e.getValue() == smallest)
            {
                if (e.getKey() < smallestKey)
                {
                    smallest = e.getValue();
                    smallestKey = e.getKey();
                }
            }
        }
        return smallestKey;
    }
}
