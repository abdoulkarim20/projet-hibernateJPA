package services;

import java.util.List;

import entities.Categorie;

public interface ICategorie {
	public void add(Categorie categorie);
	public void update(Categorie categorie);
	public void delete(int id);
	public List<Categorie> findAll();
	public Categorie findById(int id);
}
