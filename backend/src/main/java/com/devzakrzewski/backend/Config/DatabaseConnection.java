package com.devzakrzewski.backend.Config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {
    private SessionFactory sessionFactory = create_session_factory();
    private SessionFactory create_session_factory() {
        if (sessionFactory == null) {
            Configuration configration = new Configuration();
            return configration.
                    setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver")
                    .setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/plac_Zabaw")
                    .setProperty("hibernate.connection.username", "root")
                    .setProperty("hibernate.connection.password", "paradox98")
                    .setProperty("hibernate.show_sql", "true")
                    .buildSessionFactory();
        } else {
            return null;
        }
    }
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
