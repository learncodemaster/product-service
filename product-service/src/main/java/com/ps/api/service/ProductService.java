package com.ps.api.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ps.api.dao.ProductDao;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

	@Autowired
	ResourceLoader resourceLoader;

	public static final String URL = "https://www.adidas.co.uk/api/products/BB5476";

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<?> getAllProducts(String productid) throws JsonParseException, JsonMappingException, IOException {

		Map<String, Object> root = new HashMap<String, Object>();
		List list = new ArrayList<Map>();

		ObjectMapper mapper = new ObjectMapper();

		File file = ResourceUtils.getFile("classpath:data.json");

		root = mapper.readValue(Files.readAllBytes(file.toPath()), Map.class);

		System.out.println(root.get("id")+"="+productid);
		
		if(root.get("id").equals(productid)) {
			list.add(root);
		}

		
		
		
		return list;
	}

}
