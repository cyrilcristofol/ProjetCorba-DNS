package ProjetCorbaDNS.Banque;

/**
* ProjetCorbaDNS/Banque/BanqueForPublicHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/Users/Manavai/workspace/ProjetCorba-DNS/GestionNomsDomaine.idl
* vendredi 16 d�cembre 2016 18 h 25 CET
*/


/* Interface utilisé par les registrar pour demander un transfert d'argent
		lors d'un location, d'un renouvellement de domaine, ou bien d'un changement
		de Registrar par un propriétaire d'un DN. 
		
		*/
public final class BanqueForPublicHolder implements org.omg.CORBA.portable.Streamable
{
  public ProjetCorbaDNS.Banque.BanqueForPublic value = null;

  public BanqueForPublicHolder ()
  {
  }

  public BanqueForPublicHolder (ProjetCorbaDNS.Banque.BanqueForPublic initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ProjetCorbaDNS.Banque.BanqueForPublicHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ProjetCorbaDNS.Banque.BanqueForPublicHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ProjetCorbaDNS.Banque.BanqueForPublicHelper.type ();
  }

}
