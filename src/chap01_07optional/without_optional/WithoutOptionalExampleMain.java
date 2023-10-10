package chap01_07optional.without_optional;

public class WithoutOptionalExampleMain {
    public static void main(String[] args) {
        MapRepository mapRepository = new MapRepository();

//        String string = mapRepository.getValue("EXIST_KEY");

        // 존재하지않는 키 값으로 조회
        String string = mapRepository.getValue("NOT_EXIST_KEY");

        System.out.println("string = " + string);

//        System.out.println(string.toUpperCase()); // 얻어온 value 값을 대문자로 바꿔서 출력

        if (string != null) { // 조건문을 통해 null 검사 (예외 처리 : 예외 반응만 없앰)
            System.out.println(string.toUpperCase());
        }
    }
}
