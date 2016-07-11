package com.shlg.chuang.generic;

import java.util.ArrayList;
import java.util.List;

class FillTest {

	public static void main(String[] args) {
		List<Contract> contracts = new ArrayList<Contract>();
		Fill.fill(contracts, Contract.class, 3);
		Fill.fill(contracts, TitleTransfer.class, 2);
		for(Contract c : contracts)
			System.out.println(c);
		SimpleQueue<Contract> contractQueue = new SimpleQueue<Contract>();
//		Fill.fill(contractQueue, Contract.class, 3);
	}

}
