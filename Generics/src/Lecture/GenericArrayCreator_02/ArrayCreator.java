package GenericArrayCreator_02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator<T> {

    public static <T> T[] create(Class<?> clazz, int length, T defaultValue) {
        T[] arr = (T[])Array.newInstance(clazz, length);

        Arrays.fill(arr, defaultValue);

        return arr;
    }

    public static <T> T[] create (int length, T defaultValue) {
        return create(defaultValue.getClass(), length, defaultValue);
    }

}
