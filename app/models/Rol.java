package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by islas on 11/6/15.
 */
@Entity
public class Rol extends Model{

    @Required
    public String clave;

    @Required
    public String descripcion;

    @ManyToMany(cascade=CascadeType.PERSIST)
    @Required
    public List<Permiso> listadoPermisos;

    public String toString(){
        return clave;
    }
}
