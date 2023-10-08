package chap01_03abstractlayer.abstract_class;

public abstract class AbstractClass {

    /* 추상 메서드
    1. 바디가 없음
    */

    public void implementedMethod() {
        System.out.println("AbstractClass implemented Method()");
        this.abstractMethod();
    }

    abstract public void abstractMethod();
}
