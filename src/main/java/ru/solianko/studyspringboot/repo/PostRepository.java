package ru.solianko.studyspringboot.repo;

import org.springframework.data.repository.CrudRepository;
import ru.solianko.studyspringboot.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
