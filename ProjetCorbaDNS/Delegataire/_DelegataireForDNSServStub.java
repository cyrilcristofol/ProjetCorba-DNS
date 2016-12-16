package ProjetCorbaDNS.Delegataire;


/**
* ProjetCorbaDNS/Delegataire/_DelegataireForDNSServStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/Users/Manavai/workspace/ProjetCorba-DNS/GestionNomsDomaine.idl
* vendredi 16 d�cembre 2016 18 h 25 CET
*/


//
public class _DelegataireForDNSServStub extends org.omg.CORBA.portable.ObjectImpl implements ProjetCorbaDNS.Delegataire.DelegataireForDNSServ
{


  // résolution DNS
  public String resolVDomainName (String DomainName)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("resolVDomainName", true);
                ProjetCorbaDNS.DomainNameHelper.write ($out, DomainName);
                $in = _invoke ($out);
                String $result = ProjetCorbaDNS.IPAddressHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return resolVDomainName (DomainName        );
            } finally {
                _releaseReply ($in);
            }
  } // resolVDomainName


  // résolution WhoIS
  public String WhoIs (String IPAddress)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("WhoIs", true);
                ProjetCorbaDNS.IPAddressHelper.write ($out, IPAddress);
                $in = _invoke ($out);
                String $result = ProjetCorbaDNS.DomainNameHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return WhoIs (IPAddress        );
            } finally {
                _releaseReply ($in);
            }
  } // WhoIs

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ProjetCorbaDNS/Delegataire/DelegataireForDNSServ:1.0"};

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
} // class _DelegataireForDNSServStub
