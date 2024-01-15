package com.infy.rollbackpoc.demo;

public class WorkflowDto {
	private String stepnum;
	private Integer num1;
	private Integer num2;

	@Override
	public String toString() {
		return "WorkflowDto [stepnum=" + stepnum + ", num1=" + num1 + ", num2=" + num2 + ", taskname=" + taskname + "]";
	}

	private String taskname;

	public String getStepnum() {
		return stepnum;
	}

	public void setStepnum(String stepnum) {
		this.stepnum = stepnum;
	}

	public Integer getNum1() {
		return num1;
	}

	public void setNum1(Integer num1) {
		this.num1 = num1;
	}

	public Integer getNum2() {
		return num2;
	}

	public void setNum2(Integer num2) {
		this.num2 = num2;
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

}
