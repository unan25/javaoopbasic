package chap03_02slp.integrate;

public class ArticleRepository implements Repository {

    @Override
    public void createUser() {

    }

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public void createArticle() {
        // 실제로 사용할 아티클 관련 로직
    }

    @Override
    public Article findArticleById(Long id) {
        // 실제로 사용할 아티클 관련 로직
        return null;
    }
}
