
package contreras;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para calcular_IC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="calcular_IC">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Voltaje" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="Resistencia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcular_IC", propOrder = {
    "voltaje",
    "resistencia"
})
public class CalcularIC {

    @XmlElement(name = "Voltaje")
    protected double voltaje;
    @XmlElement(name = "Resistencia")
    protected double resistencia;

    /**
     * Obtiene el valor de la propiedad voltaje.
     * 
     */
    public double getVoltaje() {
        return voltaje;
    }

    /**
     * Define el valor de la propiedad voltaje.
     * 
     */
    public void setVoltaje(double value) {
        this.voltaje = value;
    }

    /**
     * Obtiene el valor de la propiedad resistencia.
     * 
     */
    public double getResistencia() {
        return resistencia;
    }

    /**
     * Define el valor de la propiedad resistencia.
     * 
     */
    public void setResistencia(double value) {
        this.resistencia = value;
    }

}
