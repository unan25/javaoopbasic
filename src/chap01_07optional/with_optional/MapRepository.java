package chap01_07optional.with_optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapRepository {

    private Map<String, String> map = new HashMap<>();

    MapRepository() {
        map.put("EXIST_KEY", "value");
    }

    // 생성 시점에서는 null여부 상관없지만 처리가 쉬움
    public Optional<String> getOptionalValue(String key) {
        return Optional.ofNullable(map.get(key)); // 옵셔널 생성
    }

}
