package com.unip.aps.entity;

public class ItemEntity {
	
	private String uuid;
	private int papel;
	private int plastico;
	private int vidro;
	private int metal;
	private int organico;
	private int outros;
	private int total;
	
	public int getPapel() {
		return papel;
	}
	public void setPapel(int papel) {
		this.papel = papel;
	}
	public int getPlastico() {
		return plastico;
	}
	public void setPlastico(int plastico) {
		this.plastico = plastico;
	}
	public int getVidro() {
		return vidro;
	}
	public void setVidro(int vidro) {
		this.vidro = vidro;
	}
	public int getMetal() {
		return metal;
	}
	public void setMetal(int metal) {
		this.metal = metal;
	}
	public int getOrganico() {
		return organico;
	}
	public void setOrganico(int organico) {
		this.organico = organico;
	}
	public int getOutros() {
		return outros;
	}
	public void setOutros(int outros) {
		this.outros = outros;
	}	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
	
	public String getUUID() {
		return uuid;
	}
	public void setUUID(String uUID) {
		uuid = uUID;
	}
	
	
	@Override
	public String toString() {
		return "ItemEntity [UUID=" + uuid + ", papel=" + papel + ", plastico=" + plastico + ", vidro=" + vidro
				+ ", metal=" + metal + ", organico=" + organico + ", outros=" + outros + ", total=" + total + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
		result = prime * result + metal;
		result = prime * result + organico;
		result = prime * result + outros;
		result = prime * result + papel;
		result = prime * result + plastico;
		result = prime * result + total;
		result = prime * result + vidro;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemEntity other = (ItemEntity) obj;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		if (metal != other.metal)
			return false;
		if (organico != other.organico)
			return false;
		if (outros != other.outros)
			return false;
		if (papel != other.papel)
			return false;
		if (plastico != other.plastico)
			return false;
		if (total != other.total)
			return false;
		if (vidro != other.vidro)
			return false;
		return true;
	}
	public ItemEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
