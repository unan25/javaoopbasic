package chap03_02slp.integrate;

// Repository 구현체
public class UesrRepository implements Repository {

    @Override
    public void createUser() { }

    @Override
    public User findUserById(Long id) {
        return null;
    }


    // 쓰지도 않을 Article 관련 로직 구현
    @Override
    public void createArticle() { }

    // 쓰지도 않을 Article 관련 로직 구현
    @Override
    public Article findArticleById(Long id) {
        return null;
    }
}
