public class GenericMethodDriver {
    public void main(String[] args){
        GenericMethodClass gmc = new GenericMethodClass();

        Integer[] integerArray = {1, 2, 3};
        String[] stringArray = {"This", "is", "fun"};

        gmc.printArray(integerArray);
        gmc.printArray(stringArray);
    }
}