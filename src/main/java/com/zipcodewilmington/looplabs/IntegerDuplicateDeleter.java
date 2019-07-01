package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] array) {
        super(array);
    }

    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] modArray = array;

        for(int i = 0; i < modArray.length; i++) {

            Integer value = modArray[i];
            int counter = 0;

            for(int j = 0; j < modArray.length; j++) {
                if(modArray[j].equals(value)) counter++;
            }

            if(counter >= maxNumberOfDuplications) {
                modArray = remove(value, modArray, modArray.length - counter);
                i = -1;
            }
        }
        return modArray;
    }
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        Integer[] modArray = array;

        for(int i = 0; i < modArray.length; i++) {

            Integer value = modArray[i];
            int counter = 0;

            for(int j = 0; j < modArray.length; j++) {
                if(modArray[j].equals(value)) counter++;
            }

            if(counter == exactNumberOfDuplications) {
                modArray = remove(value, modArray, modArray.length - exactNumberOfDuplications);
                i = -1;
            }
        }
        return modArray;
    }

    protected Integer[] remove(Integer value, Integer[] modArray, int arraySize) {
        Integer[] newArray = new Integer[arraySize];
        int index = 0;

        for(Integer num : modArray) {
            if(!num.equals(value)) {
                newArray[index] = num;
                index++;
            }
        }

        return newArray;
    }
}
