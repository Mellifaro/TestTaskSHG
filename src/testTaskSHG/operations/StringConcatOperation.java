package testTaskSHG.operations;

/**
 * Created by Виктор on 10.05.2017.
 */
public class StringConcatOperation implements Operation<String>{

    @Override
    public String doAction(String firstArg, String secondArg) {
        return firstArg + secondArg;
    }
}
