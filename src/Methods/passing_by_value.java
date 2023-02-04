package Methods;

import java.util.Arrays;

public class passing_by_value {
public static void main(String[]argv)
{
    int i = 11;
    changeIntValue(i);
    System.out.println(" i after the initial change in value " + i);

    i = changeInt(i);
    System.out.println("i after the second change " + i);

    int[] array = {1, 2, 3,};

    System.out.println("array before changeArray" + Arrays.toString(array));
    changeArray(array);
    System.out.println("array after changearray " + Arrays.toString(array));
    clearArray(array);
    System.out.println("array after cleararray is used " + Arrays.toString(array));
}

private static void changeIntValue(int i)
{
    i += 100;
}

private static void changeArray(int[] array)
{
array[1] = 200;

}

private static int changeInt(int i)
{
    i += 100;
    return i;
}

private static void clearArray(int[] array)
{
    array = null;
}
}
