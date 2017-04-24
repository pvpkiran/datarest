package in.phani.springboot.repository;

import in.phani.springboot.model.Person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by panikiran on 11.04.17.
 */

@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, Long> {
}
