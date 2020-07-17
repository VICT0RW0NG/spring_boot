package com.aswatson.pogc;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@PostMapping("/")
	@ResponseBody
	public RealTimeStock index(@RequestBody RealTimeStock realTimeStock) { 
		System.out.print("storeNo...." + realTimeStock.storeNo);
		System.out.print("realTimeStock.Items()...." + realTimeStock.getItems());
		
		for(String item: realTimeStock.getItems())
		{
			System.out.print("item...." + item);
		}
		return realTimeStock;
	}

}