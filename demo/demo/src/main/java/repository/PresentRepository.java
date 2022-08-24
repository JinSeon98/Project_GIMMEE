package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import present.Present;

import java.util.Optional;

@Repository
public interface PresentRepository extends JpaRepository<Present, Long> {

    Optional<Present> findById(Long id);
}
