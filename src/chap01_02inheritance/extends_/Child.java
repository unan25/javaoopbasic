package chap01_02inheritance.extends_;

public class Child extends Parent {
    // Parent 쪽 자원은 private 요소를 제외한 나머지를 모두 가집니다.ㄴ
    
    // Child 쪽에서 새롭게 정의하는 메서드
    
    public void anotherMethod() {
        System.out.println("Child anotherMethod");
        
        this.parentPublicInt = 0;
        this.parentProtectedInt = 0;
        // private 요소는 부모자식관계여도 호출할 수 없음
        // this.parentPrivateInt = 0;
    }
}
