package campus_threads.backend.repositories;

import org.springframework.data.repository.CrudRepository;

import campus_threads.backend.objects.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	  User findByUsername(String username);
}