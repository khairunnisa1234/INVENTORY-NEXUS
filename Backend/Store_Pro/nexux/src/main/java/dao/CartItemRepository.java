package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {

}