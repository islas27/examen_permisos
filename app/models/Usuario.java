package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by islas on 11/6/15.
 */
@Entity
public class Usuario extends Model{

    @Required
    public String username;

    @Required
    public String password;

    @Required
    public String fullName;

    @Required
    @ManyToMany(cascade= CascadeType.PERSIST)
    public List<Rol> rolesUsuario;

    public String toString(){
        return username;
    }

}
