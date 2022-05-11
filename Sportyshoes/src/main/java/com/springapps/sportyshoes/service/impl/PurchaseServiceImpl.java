package com.springapps.sportyshoes.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapps.sportyshoes.dao.PurchaseDao;
import com.springapps.sportyshoes.entity.Product;
import com.springapps.sportyshoes.entity.Purchase;
import com.springapps.sportyshoes.service.PurchaseService;

@Service
public class PurchaseServiceImpl implements PurchaseService {
	@Autowired
	private PurchaseDao purchaseDao;

	@Override
	@Transactional
	public void save(Purchase purchase) {
		purchaseDao.save(purchase);
	}

	@Override
	public List<Purchase> getPurchaseDetails() {
		List<Purchase> purchase = (List<Purchase>) purchaseDao.getPurchaseDetails();
		return purchase;
	}

	@Override
	public List<Purchase> getPurchaseByDateAndCategory(String date, int categoryid) {
		List<Purchase> purchases = (List<Purchase>) purchaseDao.getPurchaseByDateAndCategory(date,categoryid);
		return purchases;
	}

	@Override
	public List<Object[]> getSummaryReport(String date, int categoryid) {
		List<Object[]> summaryReport = (List<Object[]>) purchaseDao.getSummaryReport(date,categoryid);
		return summaryReport;
	}

}
