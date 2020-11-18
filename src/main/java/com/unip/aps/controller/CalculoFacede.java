package com.unip.aps.controller;

import java.util.ArrayList;
import java.util.List;

import com.unip.aps.entity.ItemEntity;
import com.unip.aps.model.Calculate;

public class CalculoFacede {
	
	public ItemEntity calcularValores(ItemEntity itens){
		try {
			ItemEntity calculated = new ItemEntity();	
			Calculate calculo = new Calculate();
			calculated =  calculo.calcularValores(itens);
			
			(new Thread(new AsyncController(calculated))).start();
			
			return calculated;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
