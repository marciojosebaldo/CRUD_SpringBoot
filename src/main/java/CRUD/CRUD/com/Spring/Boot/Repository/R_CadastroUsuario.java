package CRUD.CRUD.com.Spring.Boot.Repository;

import CRUD.CRUD.com.Spring.Boot.Model.M_Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface R_CadastroUsuario extends JpaRepository<M_Usuario, Long> {
}