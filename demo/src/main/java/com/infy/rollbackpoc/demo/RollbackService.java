package com.infy.rollbackpoc.demo;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RollbackService {

	public static ObjectMapper mapper = new ObjectMapper();

	public String executeWorkflow(List<Object> workflow) throws Exception {
//		List<WorkflowDto> dtoList=mapper.readerForListOf(WorkflowDto.class).readValue(workflow);
//		System.out.println(dtoList);

		for (int i = 0; i < workflow.size(); i++) {
//			JsonNode json=mapper.readTree(workflow.get(i).toString());
//			System.out.println(json);

			try {
				WorkflowDto dto = mapper.convertValue(workflow.get(i), WorkflowDto.class);
//				System.out.println(dto);
				switch (dto.getTaskname()) {
				case "add":
					this.add(dto.getNum1(), dto.getNum2());
					break;
				default:
//					System.out.println("jai mata di");
					throw new Exception("No such task found");
				}

			} catch (Exception e) {
				System.out.println("Exception at step: " + (i + 1));
				System.out.println(e.getMessage());
			}

		}

		return "hello";
	}

	public int add(int num1, int num2) {
		return num1 + num2;
	}
}
