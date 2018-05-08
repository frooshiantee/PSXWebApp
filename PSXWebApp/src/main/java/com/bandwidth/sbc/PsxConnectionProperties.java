package com.bandwidth.sbc;

public class PsxConnectionProperties {

	private int timeout;
	   private String username;
	   private String password;
	   private String url;
	   private String name;

	   public int getTimeout()
	   {
	      return timeout;
	   }

	   public void setTimeout(int timeoutIn)
	   {
	      timeout = timeoutIn;
	   }

	   public String getUsername()
	   {
	      return username;
	   }

	   public void setUsername(String usernameIn)
	   {
	      username = usernameIn;
	   }

	   public String getPassword()
	   {
	      return password;
	   }

	   public void setPassword(String passwordIn)
	   {
	      password = passwordIn;
	   }

	   public String getUrl()
	   {
	      return url;
	   }

	   public void setUrl(String urlIn)
	   {
	      url = urlIn;
	   }

	   public String getName()
	   {
	      return name;
	   }

	   public void setName(String nameIn)
	   {
	      name = nameIn;
	   }

}
