package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] array) {
        super(array);
    }

    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] modArray = array;
        for(int i = 0; i < modArray.length; i++) {

            String value = modArray[i];
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
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        String[] modArray = array;

        for(int i = 0; i < modArray.length; i++) {

            String value = modArray[i];
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

    protected String[] remove(String value, String[] modArray, int arraySize) {
        String[] newArray = new String[arraySize];
        int index = 0;

        for(String string : modArray) {
            if(!string.equals(value)) {
                newArray[index] = string;
                index++;
            }
        }

        return newArray;
    }
}
