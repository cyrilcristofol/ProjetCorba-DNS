package ProjetCorbaDNS;


/**
* ProjetCorbaDNS/DomainNameParametersHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/Users/Manavai/workspace/ProjetCorba-DNS/GestionNomsDomaine.idl
* vendredi 16 d�cembre 2016 18 h 25 CET
*/

abstract public class DomainNameParametersHelper
{
  private static String  _id = "IDL:ProjetCorbaDNS/DomainNameParameters:1.0";

  public static void insert (org.omg.CORBA.Any a, ProjetCorbaDNS.DomainNameParameters that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static ProjetCorbaDNS.DomainNameParameters extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "ParameterType",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "ParameterValue",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (ProjetCorbaDNS.DomainNameParametersHelper.id (), "DomainNameParameters", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static ProjetCorbaDNS.DomainNameParameters read (org.omg.CORBA.portable.InputStream istream)
  {
    ProjetCorbaDNS.DomainNameParameters value = new ProjetCorbaDNS.DomainNameParameters ();
    value.ParameterType = istream.read_string ();
    value.ParameterValue = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, ProjetCorbaDNS.DomainNameParameters value)
  {
    ostream.write_string (value.ParameterType);
    ostream.write_string (value.ParameterValue);
  }

}
