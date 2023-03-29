package med.voll.api.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author screamersam
 */
public interface MedicoRepository extends JpaRepository<Medico, Long>{

    public Page<Medico> findAllByAtivoTrue(Pageable pageable);
    
}
