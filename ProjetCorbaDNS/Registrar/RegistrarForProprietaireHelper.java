package ProjetCorbaDNS.Registrar;


/**
* ProjetCorbaDNS/Registrar/RegistrarForProprietaireHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/Users/Manavai/workspace/ProjetCorba-DNS/GestionNomsDomaine.idl
* vendredi 16 d�cembre 2016 18 h 25 CET
*/

abstract public class RegistrarForProprietaireHelper
{
  private static String  _id = "IDL:ProjetCorbaDNS/Registrar/RegistrarForProprietaire:1.0";

  public static void insert (org.omg.CORBA.Any a, ProjetCorbaDNS.Registrar.RegistrarForProprietaire that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ProjetCorbaDNS.Registrar.RegistrarForProprietaire extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (ProjetCorbaDNS.Registrar.RegistrarForProprietaireHelper.id (), "RegistrarForProprietaire");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ProjetCorbaDNS.Registrar.RegistrarForProprietaire read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_RegistrarForProprietaireStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ProjetCorbaDNS.Registrar.RegistrarForProprietaire value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static ProjetCorbaDNS.Registrar.RegistrarForProprietaire narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ProjetCorbaDNS.Registrar.RegistrarForProprietaire)
      return (ProjetCorbaDNS.Registrar.RegistrarForProprietaire)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      ProjetCorbaDNS.Registrar._RegistrarForProprietaireStub stub = new ProjetCorbaDNS.Registrar._RegistrarForProprietaireStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static ProjetCorbaDNS.Registrar.RegistrarForProprietaire unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof ProjetCorbaDNS.Registrar.RegistrarForProprietaire)
      return (ProjetCorbaDNS.Registrar.RegistrarForProprietaire)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      ProjetCorbaDNS.Registrar._RegistrarForProprietaireStub stub = new ProjetCorbaDNS.Registrar._RegistrarForProprietaireStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
