package ProjetCorbaDNS;

/**
* ProjetCorbaDNS/UserInformationsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/Users/Manavai/workspace/ProjetCorba-DNS/GestionNomsDomaine.idl
* vendredi 16 d�cembre 2016 18 h 25 CET
*/

public final class UserInformationsHolder implements org.omg.CORBA.portable.Streamable
{
  public ProjetCorbaDNS.UserInformations value = null;

  public UserInformationsHolder ()
  {
  }

  public UserInformationsHolder (ProjetCorbaDNS.UserInformations initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ProjetCorbaDNS.UserInformationsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ProjetCorbaDNS.UserInformationsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ProjetCorbaDNS.UserInformationsHelper.type ();
  }

}
