package ProjetCorbaDNS;


/**
* ProjetCorbaDNS/DomainNameInformations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/Users/Manavai/workspace/ProjetCorba-DNS/GestionNomsDomaine.idl
* vendredi 16 d�cembre 2016 18 h 25 CET
*/

public final class DomainNameInformations implements org.omg.CORBA.portable.IDLEntity
{
  public String domainName = null;
  public String IPAddr = null;
  public String clientUID = null;
  public String ExpirationDate = null;

  public DomainNameInformations ()
  {
  } // ctor

  public DomainNameInformations (String _domainName, String _IPAddr, String _clientUID, String _ExpirationDate)
  {
    domainName = _domainName;
    IPAddr = _IPAddr;
    clientUID = _clientUID;
    ExpirationDate = _ExpirationDate;
  } // ctor

} // class DomainNameInformations
