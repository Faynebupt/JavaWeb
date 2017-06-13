package com.study.DItest;

public class ThisServiceImpl implements ThisService {

	@Override
	public void addbook() {
		// TODO Auto-generated method stub
		this.thisdao.addbook();
		
	}
	
	private ThisDao thisdao;

	public ThisDao getThisdao() {
		return thisdao;
	}

	public void setThisdao(ThisDao thisdao) {
		this.thisdao = thisdao;
	}
	



}
