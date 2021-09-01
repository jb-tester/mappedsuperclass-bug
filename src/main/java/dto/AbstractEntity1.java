package dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class AbstractEntity1 {

  @Id
  @Type(type="pg-uuid")
  @EqualsAndHashCode.Include
  @Getter
  @Setter
  private UUID id;
  
}