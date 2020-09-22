package ru.toolkas.wicketboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.toolkas.wicketboot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
