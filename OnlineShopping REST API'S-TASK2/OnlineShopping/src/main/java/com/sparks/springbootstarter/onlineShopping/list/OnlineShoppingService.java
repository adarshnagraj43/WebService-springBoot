package com.sparks.springbootstarter.onlineShopping.list;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OnlineShoppingService {

	
	@Autowired
	private GroceriesRepository Repository1;
	@Autowired
	private MenClothingsRepository Repository2;
	@Autowired
	private WomenClothingsRepository Repository3;
	@Autowired
	private SportsRepository Repository4;
	
	
	public List<Groceries> getAllGroceries(){
		List<Groceries> groceries=new ArrayList<>();
		Repository1.findAll()
		.forEach(groceries::add);
		return groceries;
	}
	
	public Groceries getgrocery(String id)
	{
		
		Groceries g=Repository1.findById(id).get();
		return g;
	}
	
	public void addGrocery(Groceries item) {
		Repository1.save(item);
	}
	
	public void updateGrocery(String id, Groceries item) {
		
		Repository1.save(item);
	
    }
	
   public void deleteGrocery(String id) {
		
		Repository1.deleteById(id);
		
		}
   
   public List<MenClothings> getAllMenclothings(){
		List<MenClothings> Menclothings=new ArrayList<>();
		Repository2.findAll()
		.forEach(Menclothings::add);
		return Menclothings;
	}
   
   public void addMenClothings(MenClothings Menclothings) {
		// TODO Auto-generated method stub
		Repository2.save(Menclothings);
	}
   
   public MenClothings getMenclothings(String id)
	{
		
	   MenClothings m=Repository2.findById(id).get();
		return m;
	}
   
   public void updateMenclothings(String id,MenClothings Menclothings) {
		
		Repository2.save(Menclothings);
	
   }
   
   public void deleteMenclothings(String id) {
		
		Repository2.deleteById(id);
		
		}
   
   public List<WomenClothings> getAllWomenclothings(){
		List<WomenClothings> Womenclothings=new ArrayList<>();
		Repository3.findAll()
		.forEach(Womenclothings::add);
		return Womenclothings;
	}
   
   public void addWomenclothings(WomenClothings Womenclothings) {
		// TODO Auto-generated method stub
		Repository3.save( Womenclothings);
	}
   
   public WomenClothings getWomenclothings(String id)
   {
   	
	   WomenClothings w=Repository3.findById(id).get();
   	return w;
   }
   
   public void updateWomenclothings(String id,WomenClothings Womenclothings) {
		
		Repository3.save(Womenclothings);

	}
   
   public void deleteWomenclothings(String id) {
		
		Repository3.deleteById(id);
		
		}

   public List<Sports> getAllSports(){
		List<Sports> sports=new ArrayList<>();
		Repository4.findAll()
		.forEach(sports::add);
		return sports;
	}
	
   public void addSports(Sports sports) {
		// TODO Auto-generated method stub
		Repository4.save(sports);
	}
   
   public Sports getSports(String id)
   {
   	
   	Sports s=Repository4.findById(id).get();
   	return s;
   }
   
   public void updateSports(String id, Sports sports) {
		
	Repository4.save(sports);

	}
   
   public void deleteSports(String id) {
		
	Repository4.deleteById(id);
		
		}



}
