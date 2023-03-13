package ug.jpa.pedidos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import ug.jpa.pedidos.repository.ProductoRepository;
import java.util.List;
import ug.jpa.pedidos.model.Producto;

@RestController
@RequestMapping(value="/producto/")
public class ProductoController {
    
    @Autowired
    ProductoRepository productoRepository;

    @GetMapping(value="/")
    public String bienvenida(){
        return "Spring boot web...";
    }

    @GetMapping(value="/getProductos")
    public List<Producto> getProducto(){
        return productoRepository.findAll();
    }

    public String saveProducto(@RequestBody Producto producto){

        productoRepository.save(producto);
        return "Save OK";
    }
}
