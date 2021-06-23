package com.example.demo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@SpringBootTest
@AutoConfigureMockMvc
public class MedidasEscalatesTest {
	

	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
	public void count_should_return_the_countMedidas() throws Exception {
		this.mockMvc.perform(get("http://localhost:8080/MedidaEscalar/countAll")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("5003301")));
	}
	
	
	
	
	@Test
	public void countMedida_should_return_JSON() throws Exception {
		this.mockMvc.perform(get("http://localhost:8080/MedidaEscalar/countAll")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().contentType("application/json"));
	}
	
	
	
	
	@Test
	public void medida_report1_should_return_json () throws Exception {
		this.mockMvc.perform(get("http://localhost:8080/MedidaEscalar/report1")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().contentType("application/json"));;
	}
	
	
	
	@Test
	public void medida_report2_should_return_json () throws Exception {
		this.mockMvc.perform(get("http://localhost:8080/MedidaEscalar/report2")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().contentType("application/json"));;
	}
	
	
	
	
	@Test
	public void medida_report2_should_return_resutl () throws Exception {
		
		MvcResult result =	this.mockMvc.perform(get("http://localhost:8080/MedidaEscalar/report2"))
				.andExpect(status().isOk())
				.andReturn();
		
		String stringResult = result.getResponse().getContentAsString();
		boolean doesContain = stringResult.contains("{\"ecu\":\"1\",\"average\":\"87325.66666666666\",\"fechaconv\":\"\\\"2015/05\\\"\"}");
		
		assertTrue(doesContain);
	}
	
	@Test
	public void medida_report1_should_return_resutl () throws Exception {
		
		MvcResult result =	this.mockMvc.perform(get("http://localhost:8080/MedidaEscalar/report1"))
				.andExpect(status().isOk())
				.andReturn();
		
		String stringResult = result.getResponse().getContentAsString();
		boolean doesContain = stringResult.contains("{\"ecu\":\"1\",\"average\":\"277758.6428571428\",\"fechaconv\":\"\\\"2015/04\\\"\"}");
		
		assertTrue(doesContain);
	}
	
	
	@Test
	public void count_should_allow_only_get() throws Exception {
		this.mockMvc.perform(post("http://localhost:8080/MedidaEscalar/countAll")).andDo(print()).andExpect(status().isMethodNotAllowed())
		.andExpect(status().isMethodNotAllowed())
		.andExpect(header().string("Allow", "GET"));
	}
	
	
	@Test
	public void report1_should_allow_only_get() throws Exception {
		this.mockMvc.perform(post("http://localhost:8080/MedidaEscalar/report1")).andDo(print())
		.andExpect(status().isMethodNotAllowed())
		.andExpect(header().string("Allow", "GET"));
	}
	
	
	@Test
	public void report2_should_allow_only_get() throws Exception {
		this.mockMvc.perform(post("http://localhost:8080/MedidaEscalar/report2")).andDo(print()).andExpect(status().isMethodNotAllowed())
		.andExpect(status().isMethodNotAllowed())
		.andExpect(header().string("Allow", "GET"));
	}

}
