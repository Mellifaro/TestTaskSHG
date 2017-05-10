package testTaskSHG.operations;

/**
 * Created by Виктор on 10.05.2017.
 */
public class AddingOperation implements Operation<Integer>{

    @Override
    public Integer doAction(Integer firstArg, Integer secondArg) {
        return firstArg + secondArg;
    }
}
