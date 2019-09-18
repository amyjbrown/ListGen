import java.util.ArrayList;
import java.util.List;

public class ListGen {

    public static <T> List<T> Listgen(T[] arr) {
        List<T> value = new ArrayList<>();
        for (int i =0; i < arr.length; i++) {
            value.add(arr[i]);
        }
        return value;
    }

    public static List<Integer> Listgen(int[] arr) {
        List<Integer> value = new ArrayList<>();
        for (int i =0; i < arr.length; i++) {
            value.add(arr[i]);
        }
        return value;
    }
    public static List<Boolean> Listgen(boolean[] arr) {
        List<Boolean> value = new ArrayList<>();
        for (int i =0; i < arr.length; i++) {
            value.add(arr[i]);
        }
        return value;
    }

    public static List<Short> Listgen(short[] arr) {
        List<Short> value = new ArrayList<>();
        for (int i =0; i < arr.length; i++) {
            value.add(arr[i]);
        }
        return value;
    }

    public static List<Long> Listgen(long[] arr) {
        List<Long> value = new ArrayList<>();
        for (int i =0; i < arr.length; i++) {
            value.add(arr[i]);
        }
        return value;
    }

    public static List<Byte> Listgen(byte[] arr) {
        List<Byte> value = new ArrayList<>();
        for (int i =0; i < arr.length; i++) {
            value.add(arr[i]);
        }
        return value;
    }

    public static List<Float> Listgen(float[] arr) {
        List<Float> value = new ArrayList<>();
        for (int i =0; i < arr.length; i++) {
            value.add(arr[i]);
        }
        return value;
    }

    public static List<Double> Listgen(double[] arr) {
        List<Double> value = new ArrayList<>();
        for (int i =0; i < arr.length; i++) {
            value.add(arr[i]);
        }
        return value;
    }

    public static List<Character> Listgen(char[] arr) {
        List<Character> value = new ArrayList<>();
        for (int i =0; i < arr.length; i++) {
            value.add(arr[i]);
        }
        return value;
    }

}
