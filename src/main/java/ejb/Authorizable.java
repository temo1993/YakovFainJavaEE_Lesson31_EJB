package ejb;

import javax.ejb.Local;

@Local
public interface Authorizable {
      String authorize();
}
