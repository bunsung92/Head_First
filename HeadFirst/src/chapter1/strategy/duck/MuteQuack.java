package chapter1.strategy.duck;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< 조용필~~ >>");
    }
}
