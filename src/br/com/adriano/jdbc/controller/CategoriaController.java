package br.com.adriano.jdbc.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.adriano.jdbc.dao.CategoriaDAO;
import br.com.adriano.jdbc.factory.ConnectionFactory;
import br.com.adriano.jdbc.modelo.Categoria;

public class CategoriaController {

	private CategoriaDAO categoriaDAO;
	
	public CategoriaController(){
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.categoriaDAO=new CategoriaDAO(connection);
	}
	public List<Categoria> listar() {
		return categoriaDAO.listar();
	}
	public List<Categoria> listarComProduto(){
		return categoriaDAO.listarComProduto();
	}
}
