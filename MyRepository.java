package study;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import study.entity.Books;

public interface MyRepository extends JpaRepository<Books, Integer> {

	Optional<Books> findByName(String name);

}
