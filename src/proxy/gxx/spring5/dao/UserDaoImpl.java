package proxy.gxx.spring5.dao;

/**
 * @author gxx
 * @create 2021-07-27 19:26
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了........");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了.................");
        return id;
    }
}
