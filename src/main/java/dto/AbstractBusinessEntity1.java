package dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


@Getter
@Setter
@MappedSuperclass
public abstract class AbstractBusinessEntity1 extends AbstractEntity1 {
    @Column(name = "name")
    protected String name = "";
}
