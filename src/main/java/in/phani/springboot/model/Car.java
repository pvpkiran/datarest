package in.phani.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {

  @Id
  @GeneratedValue
  private Long id;
  private String model;
  private String brand;
  private Long belongs_to;
}
