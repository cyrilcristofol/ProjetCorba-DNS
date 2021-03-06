package ProjetCorbaDNS.Delegataire;


/**
* ProjetCorbaDNS/Delegataire/_DelegataireForProprietaireStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/Users/Manavai/workspace/ProjetCorba-DNS/GestionNomsDomaine.idl
* vendredi 16 d�cembre 2016 18 h 25 CET
*/


//
public class _DelegataireForProprietaireStub extends org.omg.CORBA.portable.ObjectImpl implements ProjetCorbaDNS.Delegataire.DelegataireForProprietaire
{


  // méthode pour obtenir la liste des registrar pour un nom de domaine donné pour une location
  public ProjetCorbaDNS.RegistrarClass[] DomainNameRentingRequest (String DomainName)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("DomainNameRentingRequest", true);
                ProjetCorbaDNS.DomainNameHelper.write ($out, DomainName);
                $in = _invoke ($out);
                ProjetCorbaDNS.RegistrarClass $result[] = ProjetCorbaDNS.RegistrarListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return DomainNameRentingRequest (DomainName        );
            } finally {
                _releaseReply ($in);
            }
  } // DomainNameRentingRequest

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ProjetCorbaDNS/Delegataire/DelegataireForProprietaire:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _DelegataireForProprietaireStub
