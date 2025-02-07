
package calculadora_potencia_electrica;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for potencia_electrica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="potencia_electrica">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="voltaje" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="intensidad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "potencia_electrica", propOrder = {
    "voltaje",
    "intensidad"
})
public class PotenciaElectrica {

    protected double voltaje;
    protected double intensidad;

    /**
     * Gets the value of the voltaje property.
     * 
     */
    public double getVoltaje() {
        return voltaje;
    }

    /**
     * Sets the value of the voltaje property.
     * 
     */
    public void setVoltaje(double value) {
        this.voltaje = value;
    }

    /**
     * Gets the value of the intensidad property.
     * 
     */
    public double getIntensidad() {
        return intensidad;
    }

    /**
     * Sets the value of the intensidad property.
     * 
     */
    public void setIntensidad(double value) {
        this.intensidad = value;
    }

}
