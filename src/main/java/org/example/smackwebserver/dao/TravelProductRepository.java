package org.example.smackwebserver.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelProductRepository extends JpaRepository<TravelProduct,Long> {

}
