package testTaskSHG;

import testTaskSHG.operations.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Виктор on 10.05.2017.
 */
public class Main {

    private static Map<Integer, Operation<Integer>> integerOperationMap;
    private static Map<Integer, Operation<String>> stringOperationMap;

    //initializing operation maps
    static {
        integerOperationMap = new HashMap<>();
        integerOperationMap.put(0, new AddingOperation());
        integerOperationMap.put(1, new SubstractingOperation());
        integerOperationMap.put(2, new MultiplyingOperation());
        integerOperationMap.put(3, new DividingOperation());

        stringOperationMap = new HashMap<>();
        stringOperationMap.put(0, new StringConcatOperation());
    }

    public static void main(String[] args) throws Exception {
        System.out.println("result is :" + function(6, 4, 0));
        System.out.println("result is :" + function(6, 4, 1));
        System.out.println("result is :" + function(6, 4, 2));
        System.out.println("result is :" + function(6, 4, 3));
        System.out.println("result is :" + function("6", "4", 0));

    }

    public static int function(int a, int b, int action) throws Exception {
        return integerOperationMap.get(action).doAction(a, b);
    }

    public static String function(String a, String b, int action) throws Exception {
        return stringOperationMap.get(action).doAction(a, b);
    }
}