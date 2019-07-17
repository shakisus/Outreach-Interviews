public static void main(String[] args) {

    // given license key from pat goes here
    setLicenseKey("AIzaSyBGL-AcDzDD5Mfzow6AvFzYT6UsRt3ps8w");
  
    //first good test
    
    double lat = 38.931099;
    double lon = -77.3489;
    String u = getMap(lat, lon);

  //second good test
    double lat1 = 40.742100;
    double lon1 = -74.001801;
    String u1 = getMap(lat1, lon1);
    System.out.println(u1);
  
//third good test
    double lat2 = 60.562100;
    double lon2 = -21.451801;
    String u2 = getMap(lat2, lon2);
    System.out.println(u2);

// first fail test
@Test(expected = java.lang.IllegalArgumentException.class)
    double lat3 = null;
    double lon3 = null;
    String u3 = getMap(lat2, lon2);
    System.out.println(u3);

//second fail test
@Test(expected = java.lang.IllegalArgumentException.class)
    double lat4 = "";
    double lon4 = "";
    String u4 = getMap(lat4, lon4);
    System.out.println(u4);

    //third fail test
@Test(expected = java.lang.IllegalArgumentException.class)
    double lat5 = "hello";
    double lon5 = "hello";
    String u5 = getMap(lat5, lon5);
    System.out.println(u5);
  
    
  
  }