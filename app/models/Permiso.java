package models;

import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by islas on 11/6/15.
 */
@Entity
public class Permiso extends Model {

    @Required
    @Column(name="nombre_permiso")
    public String nombrePermiso;

    @Required
    @Column(name="descripcion_permiso")
    public String descripcionPermiso;

    @Override
    public String toString(){
        return nombrePermiso;
    }

}