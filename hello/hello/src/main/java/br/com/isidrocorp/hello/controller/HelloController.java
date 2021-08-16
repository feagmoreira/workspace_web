package br.com.isidrocorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.hello.model.Produto;

// a anotação @RestController notifica a máquina virtual informando que a nossa
// classe HelloController agora é uma classe que irá responder (em seus métodos) 
//a chamadas de URL, mas quais URLs?

//agora precisamos definir uma URL para cada método que escrevemos


@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!!! Meu primeiro programa em Spring Boot! Isidro Rocks!!!";
	}
	
	@GetMapping("/hellohtml")
	public String sayHTML() {
		return "	<html> "
				+ " 	<body>"
				+ " 		<h1> Spring Boot Rules</h1>"
				+ "			<hr>"
				+ "  		<p> O Isidro fala pa bune </p>"
				+ " 	</body>"
				+ " </html>";
	}
	
	@GetMapping("/produto")
	public Produto exibirProduto() {
		Produto p = new Produto();
		p.setId(987654321);
		p.setDescricao("Computador top de linha com um monte de luzinha!");
		p.setPreco(3850.00);
		return p;
	}
	
	@PostMapping("/novoproduto")
	public String cadastrarProduto(@RequestBody Produto novo) {
		System.out.println("Produto recebido: "+ novo.getId()+"/" + novo.getDescricao() +"/" + novo.getPreco());
		return "ok";
	}

}
