package com.lzx.mybatis.generator;

import com.src.common.util.MybatisGeneratorUtil;
import com.src.common.util.PropertiesFileUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 代码生成类 Created by src on 2018/6/25. 放在Dao层下面
 */
public class Generator {

	// Model + ModelExample 存放的路径和包名
	private static String targetProjectDao = "mybatis";
	private static String modelPack = "com.lzx.mybaits.model";

	// Mapper.java + Mapper.xml 存放路径和包名
	private static String mapperPack = "com.lzx.mybatis.mapper";
	private static String targetProjectSql = "mybatis/resources/";
	private static String sqlmapperPack = mapperPack;

	// Repository 存放的路径和包名
	private static String targetRepository = "mybatis";
	private static String repositoryPack = "com.lzx.mybaits.repository";

	// 远程接口Facade 的路径和包名
	private static String targetProjectRpcApi = "mybatis";
	private static String rpcPack = "com.lzx.mybaits.rpcapi";

	// 远程接口FacadeImpl 实现类 的路径和包名
	private static String targetProjectRpcService = "mybatis";
	private static String rpcServerPack = "com.lzx.mybaits.rpcapi.impl";

	// 数据库名
	private static String DATABASE = "lzx";
	// 需要生成的数据表前缀
	private static String TABLE_PREFIX = "edu_";

	// 创建人
	private static String author = "src";
	private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.driver");
	private static String JDBC_URL = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.url");
	private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.username");
	private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.password");

	// 需要insert后返回主键的表配置，key:表名,value:主键名
	private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<>();

	static {
		LAST_INSERT_ID_TABLES.put("wechat_keyword_activity", "id");
	}

	/**
	 * 自动代码生成
	 *
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		MybatisGeneratorUtil.generator(null, true, // 是否生成Facade 层
				targetProjectDao, targetProjectSql, targetProjectRpcApi, targetProjectRpcService, targetRepository,
				modelPack, mapperPack, repositoryPack, sqlmapperPack, rpcPack, rpcServerPack, JDBC_DRIVER, JDBC_URL,
				JDBC_USERNAME, JDBC_PASSWORD, DATABASE, TABLE_PREFIX, LAST_INSERT_ID_TABLES, author);
	}

}
