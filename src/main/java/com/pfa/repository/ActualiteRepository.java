package com.pfa.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pfa.Entity.Actualite;

@Repository
public interface ActualiteRepository extends JpaRepository <Actualite ,Long> {

}
