package pers.xxx.studyunittesting.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {
	private MockMvc mvc;
	
	@Before
	public void setupMockMvc() {
		mvc = MockMvcBuilders.standaloneSetup(new TestController()).build();//初始化MockMvc对象
	}

	@Test
	public void get() throws Exception {
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON)).andReturn();
		String content = mvcResult.getResponse().getContentAsString();
		System.out.println(content);
		
		int status = mvcResult.getResponse().getStatus();
		System.out.println(status);
		
		Assert.assertTrue("不正确", status == 200);
	}

}
