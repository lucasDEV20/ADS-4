package com.lucas.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.backend.dao.PessoaDao;
import com.lucas.backend.entidade.Pessoa;

@RestController // faz a classe se comportar como webservice
@RequestMapping("/pessoa") //configura a url do webservice
public class PessoaRest {

	@Autowired //injeta uma instancia de produtoDao aqui
	private PessoaDao pessoaDao;
	
	@GetMapping //expoe o metodo GET
	public List<Pessoa> get(){
		return pessoaDao.findAll();
	}//CHAMANDO A INFO
	
	@PostMapping //expoe o metodo POST
	public void Put (@RequestBody Pessoa pessoa) { //@RequestBody - marca o objeto como corpo da mensagem POST
	pessoaDao.save(pessoa);
		
		//POSTANDO A INFORMAÇAO 
	}
	
	@DeleteMapping //DELETANDO A INFORMAÇAO QIE ESTA DENTRO DA TAQBELA
	public void delete(@PathVariable ("id")long id ) {
		pessoaDao.deleteById(id);
	
		
	}
	@PutMapping //altera as informaçoes dentro da tabela 
	public void put(@RequestBody Pessoa pessoa) {
		pessoaDao.save(pessoa);
	}
	
	
	
	

	
//	@PostMapping("/{nome}/{valor}") //expoe o metodo POST
//	public void post(@PathVariable("nome") String nome, @PathVariable("valor") BigDecimal valor) { //@RequestBody - marca o objeto como corpo da mensagem POST
//		Produto produto = new Produto();
//		produto.setNome(nome);
//		produto.setValor(valor);
//		produtoDao.save(produto);
//	}
	

}
