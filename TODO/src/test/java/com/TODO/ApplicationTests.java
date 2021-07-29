package com.TODO;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.test.web.servlet.MockMvc;

import com.API.Controllers.WorkController;
import com.API.Models.Works;
import com.API.Services.WorkService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(WorkController.class)
class ApplicationTests {
	@Autowired
    private MockMvc mockMvc;
	
    @MockBean
    private WorkService service;
    @Autowired
	private static ObjectMapper mapper = new ObjectMapper();
	
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	
//	@Test
//	public void testCreate() {
//		Works work = new Works(); 
//		Works workedSave = new Works();
//		workedSave.setId(9);
//		workedSave.setName("T");
//		workedSave.setStartDay(format.parse("2021-07-28"));
//		workedSave.setEndDay(format.parse("2021-07-28"));
//		workedSave.setStatus(2);
//		Mockito.when(service.save(work)).thenReturn(workedSave);
//		
//		String url = "";
//		
//	}
	
	
	
//	@Test
//    public void testAddWork() throws Exception {
//        Works work = new Works();
//        work.setId(9);
//        work.setName("T");
//        work.setStartDay(format.parse("2021-07-28"));
//        work.setEndDay(format.parse("2021-07-28"));
//        work.setStatus(2);
//        Mockito.when(service.save(ArgumentMatchers.any())).thenReturn("Success");
//        String json = mapper.writeValueAsString(work);
//        mockMvc.perform(post("/works").contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
//                .content(json).accept(MediaType.APPLICATION_JSON)).andExpect(status().isCreated())
//                .andExpect(jsonPath("$.id", Matchers.equalTo(9)))
//                .andExpect(jsonPath("$.name", Matchers.equalTo("T")))
//                .andExpect(jsonPath("$.startDay", Matchers.equalTo("2021-07-28")))
//                .andExpect(jsonPath("$.endDay", Matchers.equalTo("2021-07-28")))
//                .andExpect(jsonPath("$.status", Matchers.equalTo(2)));
//    }
//	
//		
//	@Test
//    public void testUpdateWork() throws Exception {
//        Works work = new Works();
//        work.setId(2);
//        work.setName("John");
//        Mockito.when(service.updateStudent(ArgumentMatchers.any())).thenReturn(student);
//        String json = mapper.writeValueAsString(student);
//        mockMvc.perform(put("/putMapping").contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
//                .content(json).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
//                .andExpect(jsonPath("$.id", Matchers.equalTo(2)))
//                .andExpect(jsonPath("$.name", Matchers.equalTo("John")));
//    }
	


}
