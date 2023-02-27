package dio.clinicaSaoJorge.cliente.repository;

import dio.clinicaSaoJorge.cliente.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClienteRepository extends JpaRepository<Clientes, Long> {

}
