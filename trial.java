//Get Request with JSON Body 

// STS was angry and required @JsonProperty
@JsonProperty
  // it also required numerous exceptions as i continued
	public String searchlyRequest() throws UnirestException, URISyntaxException, MalformedURLException {
    //request string
    String myUrl = "http://www.searchly....";
		URL url = new URL(myUrl);
		String nullFragment = null;
    // new URI parameters, according to everything I've seen on stack overflow
		URI request = new URI(url.getProtocol(), url.getHost(), url.getPath(), url.getQuery(), nullFragment);
		String newURI = request.toString();

    // com.mashape version seemed to work but I did not implement jackson... you can also
    // .body(String|JsonNode|Object)
    // may need a new ObjectMapper() instance before?
		com.mashape.unirest.http.HttpResponse<JsonNode> requestResponse = Unirest.get(newURI)
    .asJson();
		JSONObject obj = new JSONObject(requestResponse);

    //test different outputs
		System.out.println(requestResponse.toString());
		System.out.println(requestResponse.getBody());
		System.out.println(obj);
		return obj.toString();
	}
