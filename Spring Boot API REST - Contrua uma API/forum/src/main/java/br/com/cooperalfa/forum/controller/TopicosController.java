package br.com.cooperalfa.forum.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cooperalfa.forum.controller.dto.TopicoDto;
import br.com.cooperalfa.forum.modelo.Curso;
import br.com.cooperalfa.forum.modelo.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	@ResponseBody
	public List<TopicoDto> lista() {
		Topico topico = new Topico("Titulo","Mensagem", new Curso("Nome curso","Programação"));
		
		return TopicoDto.converter(Arrays.asList(topico,topico,topico,topico,topico));
	}

}
