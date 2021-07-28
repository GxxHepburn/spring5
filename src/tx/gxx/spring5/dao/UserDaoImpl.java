package tx.gxx.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author gxx
 * @create 2021-07-28 12:26
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update t_account set money = money + ? where username = ?";
        int mary = jdbcTemplate.update(sql, 100, "mary");
        System.out.println(mary);
    }

    @Override
    public void reduceMoney() {
        String sql = "update t_account set money = money - ? where username = ?";
        int lucy = jdbcTemplate.update(sql, 100, "lucy");
        System.out.println(lucy);
    }
}
