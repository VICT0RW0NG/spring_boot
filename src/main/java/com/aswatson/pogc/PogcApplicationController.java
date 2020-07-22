package com.aswatson.pogc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aswatson.pogc.request.RealTimeStockRequest;
import com.aswatson.pogc.response.Product;
import com.aswatson.pogc.response.RealTimeStockResponse;

@RestController
public class PogcApplicationController {

	
	@PostMapping("/RSIMCentral/api")
	@ResponseBody
	public RealTimeStockResponse index(@RequestBody RealTimeStockRequest realTimeStock) { 
		System.out.print("realTimeStock...." + realTimeStock.toString());
		
		RealTimeStockResponse realTimeStockResponse = new RealTimeStockResponse();
		
		realTimeStockResponse.setStoreNo(realTimeStock.getStoreNo());
		
		realTimeStockResponse.setRequestedTime(realTimeStock.getRequestedTime());

		realTimeStockResponse.setBu(realTimeStock.getBu());
		
		List<Product> productList = new ArrayList<Product>();
		
		
		Random r = new Random();
		int low = 10;
		int high = 100;
		
		for(String item: realTimeStock.getItems())
		{
		
			Product product = new Product();
			
			product.setItem(item);
			
			product.setAvailableQty(new Integer(r.nextInt(high-low) + low).toString());

			product.setInTransitQty(new Integer(r.nextInt(high-low) + low).toString());

			product.setReservedQty(new Integer(r.nextInt(high-low) + low).toString());

			product.setSoh(new Integer(r.nextInt(high-low) + low).toString());

			product.setOpeningDate("20200720");
			
			productList.add(product);
		}

		if(productList !=null )
		{
	        Product[] products= new Product[productList.size()];
	        
	        products = productList.toArray(products);
	        
	        realTimeStockResponse.setResponseCode("00");
	        
	        realTimeStockResponse.setResponseMsg("Success");
	        
	        realTimeStockResponse.setProducts(products);
		}
	    return realTimeStockResponse;
	}

	
}