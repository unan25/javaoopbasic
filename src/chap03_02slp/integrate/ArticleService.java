package chap03_02slp.integrate;

public class ArticleService {
    Repository repository = new ArticleRepository();

    public void createArticle(){
        repository.createArticle();
    }

    public Article findArticleById(long id){
        return repository.findArticleById(id);
    }
}
