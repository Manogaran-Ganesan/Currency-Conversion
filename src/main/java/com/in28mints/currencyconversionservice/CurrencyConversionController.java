package com.in28mints.currencyconversionservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

	@Autowired
	FeignProxy feignProxy;

	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean retirveConversion(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		CurrencyConversionBean currencyConversionBean = feignProxy.retriveCurrency(from, to);

		return new CurrencyConversionBean(currencyConversionBean.getId(), from, to, quantity,
				currencyConversionBean.getConversionMultiple(),
				quantity.multiply(currencyConversionBean.getConversionMultiple()),
				currencyConversionBean.getEnvironment());

	}

}
