package integracao.bancodedados;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Sort;


public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {



}