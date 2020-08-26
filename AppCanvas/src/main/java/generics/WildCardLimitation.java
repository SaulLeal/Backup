package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardLimitation {
    public static void main(String[] args) {
        List<?> wildCardList = new ArrayList<>();
//        wildCardList.add(new Integer(10));
        System.out.println(wildCardList);
    }
}
