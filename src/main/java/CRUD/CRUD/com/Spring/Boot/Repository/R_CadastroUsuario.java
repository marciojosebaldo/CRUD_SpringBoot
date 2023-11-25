package CRUD.CRUD.com.Spring.Boot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface R_CadastroUsuario extends JpaRepository<M_CadastroUsuario, Long> {
}