package com.unip.aps.model;

import java.util.ArrayList;
import java.util.List;

import com.unip.aps.entity.ItemEntity;

public class Calculate {
	
	public ItemEntity calcularValores(ItemEntity itens){
		try {
			int valPapel;
			int valPlastico;
			int valVidro;
			int valMetal;
			int valOrganico;
			int valOutros;
			int valTotal;
			ItemEntity calculated = new ItemEntity();
			
			valPapel = itens.getPapel() * 2;
			valPlastico = itens.getPlastico() * 3;
			valVidro = itens.getVidro() * 4;
			valMetal = itens.getMetal() * 5;
			valOrganico = itens.getOrganico() * 1;
			valOutros = itens.getOutros() * 1;
			
			valTotal = valPapel + valPlastico + valVidro + valMetal + valOrganico + valOutros;
			
			calculated.setMetal(valMetal);
			calculated.setOrganico(valOrganico);
			calculated.setOutros(valOutros);
			calculated.setPapel(valPapel);
			calculated.setPlastico(valPlastico);
			calculated.setVidro(valVidro);
			calculated.setTotal(valTotal);
			calculated.setUUID(itens.getUUID());
			
			return calculated;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
