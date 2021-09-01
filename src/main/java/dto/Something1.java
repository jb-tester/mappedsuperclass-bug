package dto;

import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "something1")
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class Something1 extends AbstractEntity1 {


    @Column
    private String login;
    @Column
    private String password;
}