// set the license key
public static void setLicenseKey(String lic) {
    GmapLicense = lic;
  }
  
  // methods
  public static String getMap(double lat, double lon) {
    return getMap(lat, lon, SizeMax, SizeMax);
  }
  