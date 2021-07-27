package springbook.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {
    @Bean
    public UserDao userDao() {
        return new UserDao(this.connectionMaker());
    }
    @Bean
    public AccountDao accountDao() {
        return new AccountDao(this.connectionMaker());
    }
    @Bean
    public MessageDao messageDao() {
        return new MessageDao(this.connectionMaker());
    }
    @Bean
    public ConnectionMaker connectionMaker() {
        return new SimpleConnectionMaker();
    }
}
