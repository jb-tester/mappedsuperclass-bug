package entity;

import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "something")
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class Something extends AbstractEntity {

    @Column
    private String login;
    @Column
    private String password;
    @Column
    private String role;
}