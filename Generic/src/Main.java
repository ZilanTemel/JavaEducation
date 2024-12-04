class GenericMethodExample {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] stringArray = {"Apple", "Banana", "Cherry"};
        Integer[] intArray = {1, 2, 3};

        printArray(stringArray);
        printArray(intArray);
    }
}
