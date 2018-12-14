package com.arq.testazure;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arq.testazure.service.CalculService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private CalculService calculService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		int firstOperand = 10;
		int secondOperand = 2;
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("firstOperand", firstOperand);
		model.addAttribute("secondOperand", secondOperand);
		model.addAttribute("resultAdd", calculService.processAdd(firstOperand,secondOperand));
		model.addAttribute("resultSub", calculService.processSubtract(firstOperand,secondOperand));
		model.addAttribute("resultMul", calculService.processMultiply(firstOperand,secondOperand));
		try {
			model.addAttribute("resultDiv", calculService.processDivide(firstOperand, secondOperand));
		} catch (Exception e) {
			model.addAttribute("error",e.getMessage());
		}
		
		return "home";
	}
	
}
