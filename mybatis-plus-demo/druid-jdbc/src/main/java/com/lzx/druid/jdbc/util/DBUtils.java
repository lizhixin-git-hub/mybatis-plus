package com.lzx.druid.jdbc.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * 数据库操作工具类
 */
public class DBUtils {

    private static QueryRunner QUERY_RUNNER;

    static {
        try {
            Properties pro = new Properties();
            pro.load(DBUtils.class.getClassLoader().getResourceAsStream("db.properties"));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
            QUERY_RUNNER = new QueryRunner(dataSource);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 得到数据库操作对象
     *
     * @return 数据库操作对象
     */
    public static QueryRunner queryRunner() {
        return QUERY_RUNNER;
    }

}
