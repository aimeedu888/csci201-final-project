package repositories;

import org.springframework.data.repository.CrudRepository;

import campus_threads.backend.objects.Post;

public interface PostRepository extends CrudRepository<Post, Integer>{}
