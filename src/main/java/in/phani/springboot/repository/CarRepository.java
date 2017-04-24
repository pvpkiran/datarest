package in.phani.springboot.repository;

/**
 * Created by panikiran on 11.04.17.
 */
import in.phani.springboot.model.Car;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car, Long> {

}
