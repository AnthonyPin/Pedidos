package ug.jpa.pedidos.repository;
import ug.jpa.pedidos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
