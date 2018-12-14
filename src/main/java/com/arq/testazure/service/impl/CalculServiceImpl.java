package com.arq.testazure.service.impl;

import org.springframework.stereotype.Service;

import com.arq.testazure.service.CalculService;


@Service("calculService")
public class CalculServiceImpl implements CalculService {

	@Override
	public int processAdd(int firstOperand, int secondOperand) {
		return firstOperand+secondOperand;
	}

	@Override
	public int processSubtract(int firstOperand, int secondOperand) {
		return firstOperand-secondOperand;
	}

	@Override
	public int processMultiply(int firstOperand, int secondOperand) {
		return firstOperand*secondOperand;
	}
	
	@Override
	public int processDivide(int firstOperand, int secondOperand) throws Exception {
		if (secondOperand==0) throw new Exception("Error : Divide by 0 is impossible !!");
		return firstOperand/secondOperand;
	}

}
