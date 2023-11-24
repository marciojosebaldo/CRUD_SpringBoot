package CRUD.CRUD.com.Spring.Boot.Repository;

import CRUD.CRUD.com.Spring.Boot.Model.M_Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Usuario extends JpaRepository<M_Usuario, Long> {
    @Query(value = "SELECT * FROM usuario WHERE email = :email AND senha = :senha", nativeQuery = true)
    M_Usuario buscarUsuarioPorEmailSenha(@Param("email") String email, @Param("senha") String senha);
}