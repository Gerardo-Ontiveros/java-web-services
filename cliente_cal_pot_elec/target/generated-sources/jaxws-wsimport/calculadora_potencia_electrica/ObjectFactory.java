
package calculadora_potencia_electrica;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the calculadora_potencia_electrica package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _PotenciaElectrica_QNAME = new QName("http://calculadora_potencia_electrica/", "potencia_electrica");
    private static final QName _PotenciaElectricaResponse_QNAME = new QName("http://calculadora_potencia_electrica/", "potencia_electricaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: calculadora_potencia_electrica
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PotenciaElectrica }
     * 
     * @return
     *     the new instance of {@link PotenciaElectrica }
     */
    public PotenciaElectrica createPotenciaElectrica() {
        return new PotenciaElectrica();
    }

    /**
     * Create an instance of {@link PotenciaElectricaResponse }
     * 
     * @return
     *     the new instance of {@link PotenciaElectricaResponse }
     */
    public PotenciaElectricaResponse createPotenciaElectricaResponse() {
        return new PotenciaElectricaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PotenciaElectrica }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PotenciaElectrica }{@code >}
     */
    @XmlElementDecl(namespace = "http://calculadora_potencia_electrica/", name = "potencia_electrica")
    public JAXBElement<PotenciaElectrica> createPotenciaElectrica(PotenciaElectrica value) {
        return new JAXBElement<>(_PotenciaElectrica_QNAME, PotenciaElectrica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PotenciaElectricaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PotenciaElectricaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://calculadora_potencia_electrica/", name = "potencia_electricaResponse")
    public JAXBElement<PotenciaElectricaResponse> createPotenciaElectricaResponse(PotenciaElectricaResponse value) {
        return new JAXBElement<>(_PotenciaElectricaResponse_QNAME, PotenciaElectricaResponse.class, null, value);
    }

}
