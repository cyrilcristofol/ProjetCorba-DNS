package ProjetCorbaDNS.Delegataire;

/**
* ProjetCorbaDNS/Delegataire/DelegataireForClientHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/Users/Manavai/workspace/ProjetCorba-DNS/GestionNomsDomaine.idl
* vendredi 16 d�cembre 2016 18 h 25 CET
*/


//
public final class DelegataireForClientHolder implements org.omg.CORBA.portable.Streamable
{
  public ProjetCorbaDNS.Delegataire.DelegataireForClient value = null;

  public DelegataireForClientHolder ()
  {
  }

  public DelegataireForClientHolder (ProjetCorbaDNS.Delegataire.DelegataireForClient initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ProjetCorbaDNS.Delegataire.DelegataireForClientHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ProjetCorbaDNS.Delegataire.DelegataireForClientHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ProjetCorbaDNS.Delegataire.DelegataireForClientHelper.type ();
  }

}
