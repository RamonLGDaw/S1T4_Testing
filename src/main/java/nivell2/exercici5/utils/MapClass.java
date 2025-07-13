package nivell2.exercici5.utils;

import java.util.*;

public class MapClass {

    private  HashMap<String, Integer> nameAgeMap = new HashMap<>();


    public  HashMap<String, Integer> getMap() {
        return nameAgeMap;
    }

    public  void enterValues(String name, int age){
        this.nameAgeMap.put(name, age);
    }
}
