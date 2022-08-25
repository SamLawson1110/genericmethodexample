import java.util.*;

public class GenericMethodDriver {
    public void main(String[] args){
        GenericMethodClass gmc = new GenericMethodClass();

        Integer[] integerArray = {1, 2, 3};
        String[] stringArray = {"This", "is", "fun"};

        ArrayList<Double> array1 = new ArrayList<>();
        array1.add(25.5);
        array1.add(34.9);
        array1.add(45.7);
        gmc.printList(array1);

        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(10);
        array2.add(20);
        array2.add(30);
        gmc.printList(array2);

        gmc.printArray(integerArray);
        gmc.printArray(stringArray);
    }
}
