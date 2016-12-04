
package gymService2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gymService2 package. 
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

    private final static QName _RenewResponse_QNAME = new QName("http://GymService1/", "renewResponse");
    private final static QName _SearchResponse_QNAME = new QName("http://GymService1/", "searchResponse");
    private final static QName _Bmi_QNAME = new QName("http://GymService1/", "bmi");
    private final static QName _HelloResponse_QNAME = new QName("http://GymService1/", "helloResponse");
    private final static QName _Search_QNAME = new QName("http://GymService1/", "search");
    private final static QName _UpgradeResponse_QNAME = new QName("http://GymService1/", "upgradeResponse");
    private final static QName _BmiResponse_QNAME = new QName("http://GymService1/", "bmiResponse");
    private final static QName _Hello_QNAME = new QName("http://GymService1/", "hello");
    private final static QName _Register_QNAME = new QName("http://GymService1/", "register");
    private final static QName _Upgrade_QNAME = new QName("http://GymService1/", "upgrade");
    private final static QName _RegisterResponse_QNAME = new QName("http://GymService1/", "registerResponse");
    private final static QName _Renew_QNAME = new QName("http://GymService1/", "renew");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gymService2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Upgrade }
     * 
     */
    public Upgrade createUpgrade() {
        return new Upgrade();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link BmiResponse }
     * 
     */
    public BmiResponse createBmiResponse() {
        return new BmiResponse();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link UpgradeResponse }
     * 
     */
    public UpgradeResponse createUpgradeResponse() {
        return new UpgradeResponse();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Bmi }
     * 
     */
    public Bmi createBmi() {
        return new Bmi();
    }

    /**
     * Create an instance of {@link RenewResponse }
     * 
     */
    public RenewResponse createRenewResponse() {
        return new RenewResponse();
    }

    /**
     * Create an instance of {@link Renew }
     * 
     */
    public Renew createRenew() {
        return new Renew();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GymService1/", name = "renewResponse")
    public JAXBElement<RenewResponse> createRenewResponse(RenewResponse value) {
        return new JAXBElement<RenewResponse>(_RenewResponse_QNAME, RenewResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GymService1/", name = "searchResponse")
    public JAXBElement<SearchResponse> createSearchResponse(SearchResponse value) {
        return new JAXBElement<SearchResponse>(_SearchResponse_QNAME, SearchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bmi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GymService1/", name = "bmi")
    public JAXBElement<Bmi> createBmi(Bmi value) {
        return new JAXBElement<Bmi>(_Bmi_QNAME, Bmi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GymService1/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Search }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GymService1/", name = "search")
    public JAXBElement<Search> createSearch(Search value) {
        return new JAXBElement<Search>(_Search_QNAME, Search.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpgradeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GymService1/", name = "upgradeResponse")
    public JAXBElement<UpgradeResponse> createUpgradeResponse(UpgradeResponse value) {
        return new JAXBElement<UpgradeResponse>(_UpgradeResponse_QNAME, UpgradeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BmiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GymService1/", name = "bmiResponse")
    public JAXBElement<BmiResponse> createBmiResponse(BmiResponse value) {
        return new JAXBElement<BmiResponse>(_BmiResponse_QNAME, BmiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GymService1/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GymService1/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Upgrade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GymService1/", name = "upgrade")
    public JAXBElement<Upgrade> createUpgrade(Upgrade value) {
        return new JAXBElement<Upgrade>(_Upgrade_QNAME, Upgrade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GymService1/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Renew }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GymService1/", name = "renew")
    public JAXBElement<Renew> createRenew(Renew value) {
        return new JAXBElement<Renew>(_Renew_QNAME, Renew.class, null, value);
    }

}
