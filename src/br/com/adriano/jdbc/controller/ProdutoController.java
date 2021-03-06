package br.com.adriano.jdbc.controller;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.adriano.jdbc.dao.ProdutoDAO;
import br.com.adriano.jdbc.factory.ConnectionFactory;
import br.com.adriano.jdbc.modelo.Produto;

public class ProdutoController {

	private ProdutoDAO produtoDAO;
	
	public ProdutoController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.produtoDAO=new ProdutoDAO(connection);
	}
	public void deletar(Integer id) {
		this.produtoDAO.deletar(id);
	}

	public void salvar(Produto produto) {
		this.produtoDAO.salvarComCategoria(produto);
	}

	public List<Produto> listar() {
		List<Produto> produtos = 
				this.produtoDAO.listar();
		
		return produtos;
	}

	public void alterar(String nome, String descricao, Integer id) {
		this.produtoDAO.alterar(nome, descricao, id);
	}
}
