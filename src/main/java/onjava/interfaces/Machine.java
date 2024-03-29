package onjava.interfaces;

/**
 * @Author: SelectBook
 * @Date: 2022/8/28 21:56
 */

class Bing implements Operations {
    @Override
    public void execute() {
        Operations.show("Bing");
    }
}
class Crack implements Operations {
    @Override
    public void execute() {
        Operations.show("Crack");
    }
}

class Twist implements Operations {
    @Override
    public void execute() {
        Operations.show("Twist");
    }
}

public class Machine {
    public static void main(String[] args) {
        Operations.runOps(
                new Bing(), new Crack(), new Twist());
    }
}
