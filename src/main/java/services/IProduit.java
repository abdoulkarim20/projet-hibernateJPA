package services;

import java.util.List;

import entities.Produit;

public interface IProduit {
	public void add(Produit produit);
	public void update(Produit produit);
	public void delete(int id);
	public List<Produit> findAll();
	public Produit findById(int id);
}
