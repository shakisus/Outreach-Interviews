// set the license key
public static void setLicenseKey(String lic) {
    GmapLicense = lic;
  }
  
  // method of taking all the recieved coordinates and gets returned in a specific order that sends to the data form
  public static String getMap(double lat, double lon) {
    return getMap(lat, lon, SizeMax, SizeMax);
  }
  