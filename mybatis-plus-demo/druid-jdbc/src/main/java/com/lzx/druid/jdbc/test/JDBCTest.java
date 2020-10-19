package com.lzx.druid.jdbc.test;

import com.lzx.druid.jdbc.util.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;

public class JDBCTest {

    public static void main(String[] args) {
        QueryRunner queryRunner = DBUtils.queryRunner();
        String sql = "SELECT c_name FROM edu_class WHERE c_id = ?";
        Object[] params = new Object[]{1};
        try {
            String cName = queryRunner.query(sql, new ScalarHandler<>(), params);
            System.out.println(cName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
