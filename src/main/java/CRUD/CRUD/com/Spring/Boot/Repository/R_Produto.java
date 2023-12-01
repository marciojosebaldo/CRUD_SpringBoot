package CRUD.CRUD.com.Spring.Boot.Repository;

import CRUD.CRUD.com.Spring.Boot.Model.M_Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface R_Produto extends JpaRepository<M_Produto, Long> {
    void deleteById(Long id);
}