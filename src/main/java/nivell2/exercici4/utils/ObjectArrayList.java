package nivell2.exercici4.utils;

import java.util.ArrayList;
import java.util.List;

public class ObjectArrayList {

    private  ArrayList<Object> objectsArray = new ArrayList<>();

    public void addObject(Object object){
        this.objectsArray.add(object);
    }


    public void showObjectsArray(){
        for(Object object: objectsArray){
            System.out.println(object);
        }
    }

    public List<Object> getObjectsArray() {
        return objectsArray;
    }

}
