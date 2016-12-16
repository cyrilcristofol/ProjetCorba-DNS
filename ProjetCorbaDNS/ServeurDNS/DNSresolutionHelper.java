package ProjetCorbaDNS.ServeurDNS;


/**
* ProjetCorbaDNS/ServeurDNS/DNSresolutionHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/Users/Manavai/workspace/ProjetCorba-DNS/GestionNomsDomaine.idl
* vendredi 16 d�cembre 2016 18 h 25 CET
*/


//
abstract public class DNSresolutionHelper
{
  private static String  _id = "IDL:ProjetCorbaDNS/ServeurDNS/DNSresolution:1.0";

  public static void insert (org.omg.CORBA.Any a, ProjetCorbaDNS.ServeurDNS.DNSresolution that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ProjetCorbaDNS.ServeurDNS.DNSresolution extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (ProjetCorbaDNS.ServeurDNS.DNSresolutionHelper.id (), "DNSresolution");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ProjetCorbaDNS.ServeurDNS.DNSresolution read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_DNSresolutionStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ProjetCorbaDNS.ServeurDNS.DNSresolution value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static ProjetCorbaDNS.ServeurDNS.DNSresolution narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ProjetCorbaDNS.ServeurDNS.DNSresolution)
      return (ProjetCorbaDNS.ServeurDNS.DNSresolution)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      ProjetCorbaDNS.ServeurDNS._DNSresolutionStub stub = new ProjetCorbaDNS.ServeurDNS._DNSresolutionStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static ProjetCorbaDNS.ServeurDNS.DNSresolution unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ProjetCorbaDNS.ServeurDNS.DNSresolution)
      return (ProjetCorbaDNS.ServeurDNS.DNSresolution)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      ProjetCorbaDNS.ServeurDNS._DNSresolutionStub stub = new ProjetCorbaDNS.ServeurDNS._DNSresolutionStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
