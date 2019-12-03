package com.generator.generator.test;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratorSqlmap {

	public void generator() throws Exception{

		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		//指定 逆向工程配置文件
		File configFile = new File("F:/lecar-work/generator/src/main/resources/generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);

	}
//	public static void main(String[] args) throws Exception {
//		try {
//			GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
//			generatorSqlmap.generator();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}

	public static void main(String[] args) throws Exception{
		GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();

		generatorSqlmap.generator2();
		System.out.println(System.getProperty("user.dir"));
	}

	public void generator2() throws Exception{

		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File("F:/lecar-work/generator/src/main/resources/generatorConfig.xml");
		InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
//		Configuration config = cp.parseConfiguration(resourceAsStream);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);

		for(String warning:warnings){
			System.out.println(warning);
		}
	}


}
