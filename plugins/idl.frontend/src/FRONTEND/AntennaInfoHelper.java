package FRONTEND;


/**
* FRONTEND/AntennaInfoHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /data/Workspaces/dev_1-10_workspace/mil.jpeojtrs.sca/plugins/idl.frontend/idl/redhawk/FRONTEND/Frontend.idl
* Wednesday, December 18, 2013 5:32:24 PM EST
*/

abstract public class AntennaInfoHelper
{
  private static String  _id = "IDL:FRONTEND/AntennaInfo:1.0";

  public static void insert (org.omg.CORBA.Any a, FRONTEND.AntennaInfo that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static FRONTEND.AntennaInfo extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [4];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "name",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "type",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "size",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "description",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (FRONTEND.AntennaInfoHelper.id (), "AntennaInfo", _members0);
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

  public static FRONTEND.AntennaInfo read (org.omg.CORBA.portable.InputStream istream)
  {
    FRONTEND.AntennaInfo value = new FRONTEND.AntennaInfo ();
    value.name = istream.read_string ();
    value.type = istream.read_string ();
    value.size = istream.read_string ();
    value.description = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, FRONTEND.AntennaInfo value)
  {
    ostream.write_string (value.name);
    ostream.write_string (value.type);
    ostream.write_string (value.size);
    ostream.write_string (value.description);
  }

}