package bank;

import javax.security.auth.login.LoginException;
import javax.sql.DataSource;

public class Authenticator {

  public static Customer login(String username, String password)
      throws LoginException {
    Customer customer = DataSource. //.getCustomer(username);
    if (customer == null) {
      throw new LoginException("Username not found");
    }
  }

  public static void logout(Customer customer) {

  }
}
