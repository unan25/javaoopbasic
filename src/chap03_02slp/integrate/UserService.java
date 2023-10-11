package chap03_02slp.integrate;

public class UserService {

    private Repository repository = new UesrRepository();

    public void createUser() {
        repository.createUser();
    }
    public User findByUser(Long id) {
        return repository.findUserById(id);
    }
}
