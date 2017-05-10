package testTaskSHG.operations;

/**
 * Created by Виктор on 10.05.2017.
 */
//Interface, that describes our operations with integers and strings
public interface Operation<T> {
    T doAction(T firstArg, T secondArg);
}