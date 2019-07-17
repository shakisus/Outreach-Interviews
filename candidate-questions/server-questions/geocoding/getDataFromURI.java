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