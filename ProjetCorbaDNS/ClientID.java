package ProjetCorbaDNS;


/**
* ProjetCorbaDNS/ClientID.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/Users/Manavai/workspace/ProjetCorba-DNS/GestionNomsDomaine.idl
* vendredi 16 d�cembre 2016 18 h 25 CET
*/

public final class ClientID implements org.omg.CORBA.portable.IDLEntity
{
  public ProjetCorbaDNS.UserInformations userInformations = null;
  public String clientUID = null;

  public ClientID ()
  {
  } // ctor

  public ClientID (ProjetCorbaDNS.UserInformations _userInformations, String _clientUID)
  {
    userInformations = _userInformations;
    clientUID = _clientUID;
  } // ctor

} // class ClientID
