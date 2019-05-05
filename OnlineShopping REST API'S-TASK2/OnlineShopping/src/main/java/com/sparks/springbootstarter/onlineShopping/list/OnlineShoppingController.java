package com.sparks.springbootstarter.onlineShopping.list;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class OnlineShoppingController {

	
	@Autowired
	private OnlineShoppingService service1;
	@Autowired
	private OnlineShoppingService service2;
	@Autowired
	private OnlineShoppingService service3;
	@Autowired
	private OnlineShoppingService service4;
	
	@RequestMapping("/Grocery")
	public List<Groceries> getAllGroceries()
	{
		return (List<Groceries>) service1.getAllGroceries();
	}
	
	@RequestMapping("/Grocery/{id}")
	public Groceries getgrocery(@PathVariable String id)
	{
		return (Groceries) service1.getgrocery(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/Grocery")
	public void addGrocery(@RequestBody Groceries item) {
		service1.addGrocery(item);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/Grocery/{id}")
	public void updateGrocery(@RequestBody Groceries item, @PathVariable String id) {
		service1.updateGrocery(id, item);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/Grocery/{id}")
	public void deleteGrocery(@RequestBody Groceries item, @PathVariable String id) {
		service1.deleteGrocery(id);
	}
	
	@RequestMapping("/Menclothings")
	public List<MenClothings> getAllMenclothings()
	{
		return service2.getAllMenclothings();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/Menclothings")
	public void addMenclothings(@RequestBody MenClothings Menclothings) {
		service2.addMenClothings(Menclothings);
		
	}
	
	@RequestMapping("/Menclothings/{id}")
	public MenClothings getMenClothings(@PathVariable String id)
	{
		return (MenClothings) service2.getMenclothings(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/Menclothings/{id}")
	public void updateMenClothings(@RequestBody MenClothings Menclothings, @PathVariable String id) {
		service2.updateMenclothings(id, Menclothings );
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/Menclothings/{id}")
	public void deleteMenclothings(@RequestBody MenClothings Menclothings, @PathVariable String id) {
		service2.deleteMenclothings(id);
	}
	
	@RequestMapping("/Womenclothings")
	public List<WomenClothings> getAllWomenclothings()
	{
		return service3.getAllWomenclothings();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/Womenclothings")
	public void addWomenclothings(@RequestBody WomenClothings Womenclothings) {
		service3.addWomenclothings(Womenclothings);
		
		
	}
	
	@RequestMapping("/Womenclothings/{id}")
	public WomenClothings getKanSong(@PathVariable String id)
	{
		return (WomenClothings) service3.getWomenclothings(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/Womenclothings/{id}")
	public void updateWomenclothings(@RequestBody WomenClothings Womenclothings, @PathVariable String id) {
		service3.updateWomenclothings(id,Womenclothings);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/Womenclothings/{id}")
	public void deleteWomenclothings(@RequestBody WomenClothings Womenclothings, @PathVariable String id) {
		service3.deleteWomenclothings(id);
	}
	
	@RequestMapping("/Sports")
	public List<Sports> getAllSports()
	{
		return (List<Sports>)service4.getAllSports();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/Sports")
	public void addSports(@RequestBody Sports sports) {
		service4.addSports(sports);
		
		
	}
	
	@RequestMapping("/Sports/{id}")
	public  Sports getSports(@PathVariable String id)
	{
		return (Sports) service4.getSports(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/Sports/{id}")
	public void updateSports(@RequestBody Sports sports, @PathVariable String id) {
		service4.updateSports(id, sports);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/Sports/{id}")
	public void deleteSports(@RequestBody Sports Sports, @PathVariable String id) {
		service4.deleteSports(id);
	}
	
	
	
	
	
}
