
package contreras;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the contreras package. 
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

    private static final QName _CalcularIC_QNAME = new QName("http://contreras/", "calcular_IC");
    private static final QName _CalcularICResponse_QNAME = new QName("http://contreras/", "calcular_ICResponse");
    private static final QName _Hello_QNAME = new QName("http://contreras/", "hello");
    private static final QName _HelloResponse_QNAME = new QName("http://contreras/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: contreras
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularIC }
     * 
     * @return
     *     the new instance of {@link CalcularIC }
     */
    public CalcularIC createCalcularIC() {
        return new CalcularIC();
    }

    /**
     * Create an instance of {@link CalcularICResponse }
     * 
     * @return
     *     the new instance of {@link CalcularICResponse }
     */
    public CalcularICResponse createCalcularICResponse() {
        return new CalcularICResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     * @return
     *     the new instance of {@link Hello }
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     * @return
     *     the new instance of {@link HelloResponse }
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularIC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularIC }{@code >}
     */
    @XmlElementDecl(namespace = "http://contreras/", name = "calcular_IC")
    public JAXBElement<CalcularIC> createCalcularIC(CalcularIC value) {
        return new JAXBElement<>(_CalcularIC_QNAME, CalcularIC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularICResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularICResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://contreras/", name = "calcular_ICResponse")
    public JAXBElement<CalcularICResponse> createCalcularICResponse(CalcularICResponse value) {
        return new JAXBElement<>(_CalcularICResponse_QNAME, CalcularICResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://contreras/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://contreras/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
