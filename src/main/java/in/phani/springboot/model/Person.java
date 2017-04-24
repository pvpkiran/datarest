package in.phani.springboot.model;

import lombok.Data;

import org.springframework.data.annotation.Reference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Person {

  @Id
  private Long id;
  private String firstName;
  private String lastName;

  @Reference
  @OneToMany(mappedBy = "belongs_to")
  private List<Car> cars;

}