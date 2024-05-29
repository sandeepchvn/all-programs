package com.lamda.stream_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDriver {
	public static void main(String[] args) {
		Product product = new Product();
		product.setId(3);
		product.setName("i phone 14");
		product.setAddress("indiquce road");
		product.setCost(6543456);

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("car");
		product2.setAddress("btm road");
		product2.setCost(43456);

		Product product3 = new Product();
		product3.setId(5);
		product3.setName("pen");
		product3.setAddress("bijapur");
		product3.setCost(6);

		Product product4 = new Product();
		product4.setId(4);
		product4.setName("bike");
		product4.setAddress("bangolore");
		product4.setCost(63456);

		Product product5 = new Product();
		product5.setId(1);
		product5.setName("i phone 10");
		product5.setAddress("indi");
		product5.setCost(6543456);

		List<Product> products=new ArrayList<Product>();
		products.add(product);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		
		// using for each method printing list
//		products.forEach(p->System.out.println(p));
		
		//stream api 
		
		List<Product> list=products.stream().filter(pro->pro.getCost()>500).map(p -> p).collect(Collectors.toList());
		
		// max cost product will be given
		Product maxpriceProduct=products.stream().max((p1,p2)->(int)p1.getCost()-(int)p2.getCost()).get();
		System.out.println(maxpriceProduct);
		
		// min cost product will be given
		Product minpriceProduct=products.stream().min((p1,p2)->(int)p1.getCost()-(int)p2.getCost()).get();
		System.out.println(minpriceProduct);
		
		// total cost of products will be given
		double cost=products.stream().collect(Collectors.summingDouble(p -> p.getCost()));
		System.out.println(cost);
	}
}
