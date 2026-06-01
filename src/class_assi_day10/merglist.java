package class_assi_day10;


import java.util.*;

class merglist {
public static void main(String[] args) {

ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "A", "C"));
ArrayList<String> list2 = new ArrayList<>(Arrays.asList("B", "D", "D", "E"));

ArrayList<String> list3 = new ArrayList<>();


for (String s : list1) {
if (!list3.contains(s)) {
list3.add(s);
}
}


for (String s : list2) {
if (!list3.contains(s)) {
list3.add(s);
}
}

System.out.println("merge list: " + list3);
}
}