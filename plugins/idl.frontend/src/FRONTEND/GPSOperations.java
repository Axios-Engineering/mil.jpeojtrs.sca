package FRONTEND;


/**
* FRONTEND/GPSOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /data/Workspaces/dev_1-10_workspace/mil.jpeojtrs.sca/plugins/idl.frontend/idl/redhawk/FRONTEND/GPS.idl
* Wednesday, December 18, 2013 5:32:24 PM EST
*/


/************************/
public interface GPSOperations 
{

  /** Updates as necessary */
  FRONTEND.GPSInfo gps_info ();

  /** Updates as necessary */
  void gps_info (FRONTEND.GPSInfo newGps_info);

  /** Main timing structure. If pososition is not known, set position valid to false */
  FRONTEND.GpsTimePos gps_time_pos ();

  /** Main timing structure. If pososition is not known, set position valid to false */
  void gps_time_pos (FRONTEND.GpsTimePos newGps_time_pos);
} // interface GPSOperations