package com.sucre.jpatravel.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PaymentTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext wac;
	
	@Test
	public void testPaymentApi() throws Exception {
		String resultStr = mockMvc.perform(MockMvcRequestBuilders.post("/payment/paymentInfo")).andReturn().getResponse().getContentAsString();
		System.out.println(resultStr);
		
		//第一次睡眠
		long gap1 = 30000;
		System.out.println("第一次睡眠"+gap1/1000+"秒。。。");
		Thread.currentThread().sleep(gap1);
		resultStr = mockMvc.perform(MockMvcRequestBuilders.post("/payment/paymentInfo")).andReturn().getResponse().getContentAsString();
		System.out.println(resultStr);
		
		//第二次睡眠
		long gap2 = 35000;
		System.out.println("第二次睡眠"+gap2/1000+"秒。。。");
		Thread.currentThread().sleep(gap2);
		resultStr = mockMvc.perform(MockMvcRequestBuilders.post("/payment/paymentInfo")).andReturn().getResponse().getContentAsString();
		System.out.println(resultStr);
	}
	
	
	/*
	 * @Test public void testPaymentApi() throws Exception { MockMvcBuilder
	 * mockMvc.perform(MockMvcRequestBuilders.post("/payment/paymentInfo")); }
	 */
	
}
