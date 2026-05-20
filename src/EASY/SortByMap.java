package EASY;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortByMap {
    public static void main(String[] args) {
        Map<String,Integer> nonSortedMap = Map.of(
                "Two", 2,
                "Three", 3,
                "Five", 5,
                "One", 1,
                "Four", 4
        );
        nonSortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
//        Map<String,Integer> sorted = nonSortedMap.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue())
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (a,b) -> a,
//                        LinkedHashMap::new
//                ));
//        sorted.entrySet().forEach(System.out::println);

//        Map<String,Integer> sortedMap = sortByValue(nonSortedMap);
//        sortedMap.entrySet().forEach(System.out::println);
    }

//     static Map<String, Integer> sortByValue(Map<String, Integer> map) {
//        TreeMap<String,Integer> temp = new TreeMap<>(new MyMapCompare(map));
//        temp.putAll(map);
//        return temp;
//    }
//    static class MyMapCompare implements Comparator<String> {
//
//        private final Map<String,Integer> map;
//
//        public MyMapCompare(Map<String, Integer> map) {
//            this.map = map;
//        }
//
//        @Override
//        public int compare(String o1, String o2) {
//            return map.get(o1) - map.get(o2);
//        }
//    }
}

