package entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "another")
public class Another extends AbstractBusinessEntity {

    @Column
    private String status;
    @Column
    private String lastvisit;

}
