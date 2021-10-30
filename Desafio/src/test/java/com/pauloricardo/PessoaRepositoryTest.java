package com.pauloricardo;

import javax.validation.ConstraintViolationException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@DataJpaTest
public class PessoaRepositoryTest {

	@Autowired
	private PessoaRepository pessoaRepository;
	

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	private PessoaModel pessoa;

	@Before
	public void start() {
		pessoa = new PessoaModel("0xx.152.698-00", "joao", "prfultra@yahoo.com.br", 35);
	}
	
	@Test
	public void saveComCpfException() throws Exception{
		expectedException.expect(ConstraintViolationException.class);
		expectedException.expectMessage("O CPF deve ser preenchido");
		
		pessoa.setNome(null);
		pessoaRepository.save(pessoa);
	}
	
	@Test
	public void saveComNomeException() throws Exception{
		expectedException.expect(ConstraintViolationException.class);
		expectedException.expectMessage("O nome deve ser preenchido");
		
		pessoa.setNome(null);
		pessoaRepository.save(pessoa);
	}
	
	@Test
	public void saveComEmailException() throws Exception{
		expectedException.expect(ConstraintViolationException.class);
		expectedException.expectMessage("O email deve ser preenchido");
		
		pessoa.setEmail(null);
		pessoaRepository.save(pessoa);
	}
	
	@Test
	public void saveComIdadeException() throws Exception{
		expectedException.expect(ConstraintViolationException.class);
		expectedException.expectMessage("A idade deve ser preenchida");
		
		pessoa.setIdade((Integer) null);
		pessoaRepository.save(pessoa);
	}
	
	
}
