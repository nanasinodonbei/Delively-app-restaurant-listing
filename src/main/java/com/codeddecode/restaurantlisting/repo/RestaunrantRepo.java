package com.codeddecode.restaurantlisting.repo;

import com.codeddecode.restaurantlisting.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaunrantRepo extends JpaRepository<Restaurant,Integer> {
}
