/** use httpclient to get the data */
public static ByteBuffer getDataFromURI(String uri) throws IOException {

    GetMethod get = new GetMethod(uri);
  
    try {
      new HttpClient().executeMethod(get);
      return new ByteBuffer(get.getResponseBodyAsStream());
    }
    finally {
      get.releaseConnection();
    }
  
  }

//had to find this online as I did not understand how to get information from outside sources.
//the main java file would then display this information when the tests are run