package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


@Getter
@Setter
@MappedSuperclass
public abstract class AbstractBusinessEntity extends AbstractEntity {

    @Column(name = "name")
    protected String name = "";
}
