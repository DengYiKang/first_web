package com.example.first_web.config;


import org.hibernate.dialect.MySQL55Dialect;

public class MysqlConfig extends MySQL55Dialect {
    @Override
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
