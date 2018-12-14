package com.arq.testazure.service;

public interface CalculService {

	int processAdd(int firstOperand, int secondOperand);

	int processSubtract(int firstOperand, int secondOperand);

	int processMultiply(int firstOperand, int secondOperand);
	
	int processDivide(int firstOperand, int secondOperand) throws Exception;
}
