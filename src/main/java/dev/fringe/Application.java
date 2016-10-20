package dev.fringe;

import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class Application {
    @Autowired private DataSource dataSource;

    @Test public void isClosed() throws SQLException {
        if(dataSource != null) {
            System.out.println(dataSource.getConnection().isClosed());
        }
    }
}
