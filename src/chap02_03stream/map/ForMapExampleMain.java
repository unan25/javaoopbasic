package chap02_03stream.map;

import java.util.ArrayList;
import java.util.List;

public class ForMapExampleMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            integerList.add(i);
        }

        List<Integer> x10IntegerList = new ArrayList<>();

        for (int i = 0; i < integerList.size(); i++) {
            x10IntegerList.add(integerList.get(i) * 10);
        }
        System.out.println(integerList);
        System.out.println(x10IntegerList);
    }
}
