package uv.web.nihongo.repositories;

import org.springframework.data.repository.CrudRepository;
import uv.web.nihongo.entities.Admin;

public interface AdminRepo extends CrudRepository<Admin, Integer> {
    Admin findByUsername(String username);
}