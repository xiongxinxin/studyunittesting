package pers.xxx.studyunittesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
/**
 * 两种方式获取项目属性文件
 * @author xiongxinxin
 *
 */
public class StudyunittestingApplicationTests {
	@Value("${name}")
	private String name;
	
	@Autowired
	private Environment env;
	
	@BeforeClass 
	public static void beforeClass() {
		System.out.println("==============beforeClass===================");
	}
	
	@Before
	public void init() {
		System.out.println("===============init=================");
	}
	
	@After
	public void destroy() {
		System.out.println("=================destroy=====================");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("======================Afterclass=============");
	}

	@Test
	@Ignore
	public void contextLoads() {
		System.out.println("=========contextLoads==============");
		System.out.println(name);
	}
	
	@Test
	public void testEnv() {
		System.out.println("===============testEnv================");
		System.out.println(env.getProperty("name"));
	}

}

