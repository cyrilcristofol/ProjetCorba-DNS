package ProjetCorbaDNS;


/**
* ProjetCorbaDNS/UserInformations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/Users/Manavai/workspace/ProjetCorba-DNS/GestionNomsDomaine.idl
* vendredi 16 d�cembre 2016 18 h 25 CET
*/

public final class UserInformations implements org.omg.CORBA.portable.IDLEntity
{
  public String nom = null;
  public String prenom = null;
  public int age = (int)0;

  // int en java
  public String adresse = null;
  public String mail = null;
  public String password = null;
  public String RIB = null;

  public UserInformations ()
  {
  } // ctor

  public UserInformations (String _nom, String _prenom, int _age, String _adresse, String _mail, String _password, String _RIB)
  {
    nom = _nom;
    prenom = _prenom;
    age = _age;
    adresse = _adresse;
    mail = _mail;
    password = _password;
    RIB = _RIB;
  } // ctor

} // class UserInformations
