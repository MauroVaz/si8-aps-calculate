package com.unip.aps.controller;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.unip.aps.dao.ValoresDAO;
import com.unip.aps.entity.ItemEntity;

public class AsyncController implements Runnable  {
	
	ValoresDAO valDAO = new ValoresDAO();
	ItemEntity itemEntity = new ItemEntity();
	
	public AsyncController(ItemEntity itemEntity)  {
		try{
			this.itemEntity = itemEntity;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	@Override
	public void run() {
		
		try {
			 
			valDAO.insertValores(itemEntity);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		
	}
	
	public void insert(ItemEntity itemEntity) {
		valDAO.insertValores(itemEntity);
	}

}
