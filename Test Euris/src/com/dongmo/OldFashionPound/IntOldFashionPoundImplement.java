package com.dongmo.OldFashionPound;

public class IntOldFashionPoundImplement implements IntOldFashionPound {
	
	private final static String sterling="p";
	private final static String scellini="s";
	private final static String pennies="d";
	
	private int st_num;
	private int sc_num;
	private int pe_num;
	
	private int sum_sc;
	private int sum_pe;
	
	private int resto_st;
	private int resto_sc;
	private int resto_pe;
	
	private int subs_st;
	private int subs_sc;
	private int subs_pe;
	
	private int prod_1;
	private int prod_2;
	private int prod_3;
	
	private int ritenuta_1;
	private int ritenuta_2;
	private String resto;
	
	@Override
	public String somma(int st1, int sc1, int pe1, int st2, int sc2, int pe2) {
	
		sum_pe= pe1 + pe2;
		resto_pe=sum_pe%12;
		if(resto_pe!=0) {
			pe_num=resto_pe;
			ritenuta_1=sum_pe-resto_pe;
		}
		else {
			pe_num=sum_pe;
		}
		
		int addNum=ritenuta_1/12;
		sum_sc= sc1 + sc2 + addNum;
		resto_sc=sum_sc%20;
		if(resto_sc!=0) {
			sc_num=resto_sc;
			ritenuta_2=sum_sc-resto_sc;
		}
		else 
		{
			sc_num=sum_sc;
		}
		
		int addNum2=ritenuta_2/20;
		st_num= st1 + st2 + addNum2;
		
		return st_num+sterling + " " + sc_num+scellini + " " + pe_num+pennies ;
	}

	@Override
	public String sottrazione(int st1, int sc1, int pe1, int st2, int sc2, int pe2) {
		
		subs_pe=pe1-pe2;
		if(subs_pe<0) {
			subs_pe=subs_pe*(-1);
		}
		
		subs_sc=sc1-sc2;
		if(subs_sc<0) {
			subs_sc=subs_sc*(-1);
		}
		
		subs_st=st1-st2;
		if(subs_st<0) {
			subs_st=subs_st*(-1);
		}
		return subs_st+sterling + " " + subs_sc+scellini + " " + subs_pe+pennies ;
	}

	@Override
	public String moltiplicazione(int st, int sc, int pe, int num) {

		prod_1 = pe*num;
		resto_pe=prod_1%12;
		if(resto_pe!=0) {
			pe_num=resto_pe;
		}
		else {
			pe_num=prod_1;
		}
		
		ritenuta_1=prod_1-resto_pe;
		int addNum=ritenuta_1/12;
		prod_2=sc*num;
		resto_sc=prod_2%20;
		if(resto_sc!=0) {
			sc_num=resto_sc+addNum;
		}else {
			sc_num=prod_2;
		}
		
		ritenuta_2=prod_2-resto_sc;
		int addNum2=ritenuta_2/20;
		prod_3=st*num;
		st_num=prod_3+addNum2;
		
		return st_num+sterling + " " + sc_num+scellini + " " + pe_num+pennies ;
	}

	@Override
	public String divisione(int st, int sc, int pe, int num) {

		resto_pe=pe%num;
		if(resto_pe!=0) {
			pe_num=(pe-resto_pe)/num;
		}else {
			pe_num=pe/num;
		}
		
		resto_sc=sc%num;
		if(resto_sc!=0) {
			sc_num=(sc-resto_sc)/num;
		}
		else {
			sc_num=sc/num;
		}
		
		resto_st=st%num;
		if(resto_st!=0) {
			st_num=(st-resto_st)/num;
		}
		else {
			st_num=st/num;
		}
		resto = " (Resto:" + resto_st+sterling + " " + resto_sc+scellini + " " + resto_pe+pennies + ")";
		return st_num+sterling + " " + sc_num+scellini + " " + pe_num+pennies + resto;
	}
}
