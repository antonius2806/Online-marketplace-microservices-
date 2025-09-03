package com.marketplace.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marketplace.shoppingcart.entity.CartEntity;

import java.util.List;


@Repository
public interface CartRepository extends JpaRepository<CartEntity, Long> {
    List<CartEntity> findByUserId(Long userId);
}
