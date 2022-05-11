package com.springapps.sportyshoes.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springapps.sportyshoes.dao.PurchaseDao;
import com.springapps.sportyshoes.entity.Product;
import com.springapps.sportyshoes.entity.Purchase;

@Repository
public class PurchaseDaoImpl implements PurchaseDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void save(Purchase purchase) {
		this.hibernateTemplate.save(purchase);
	}

	@Override
	public List<Purchase> getPurchaseDetails() {
		 List<Purchase> purchase = hibernateTemplate.loadAll(Purchase.class);
		return purchase;
	}

	@Override
	public List<Purchase> getPurchaseByDateAndCategory(String date, int categoryid) {
		List<Purchase> purchase = (List<Purchase>) hibernateTemplate.find("from Purchase where date=?0 and catid=?1", new Object[]{date,categoryid});
		return purchase;
	}

	@Override
	public List<Object[]> getSummaryReport(String date, int categoryid) {
		List<Object[]> summaryReport = (List<Object[]>) hibernateTemplate.find("select pr.catid,pr.date,p.productid,p.productname,p.productprice,p.categoryname,count(p.productid) from Purchase pr join pr.products p where pr.date=?0 and pr.catid=?1 group by pr.products", new Object[]{date,categoryid});
		return summaryReport;
	}

}
