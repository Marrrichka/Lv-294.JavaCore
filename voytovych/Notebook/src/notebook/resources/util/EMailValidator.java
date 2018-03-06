package notebook.resources.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EMailValidator {
   private Pattern pattern;
   private Matcher matcher;

   private static final String EMAIL_PATTERN =
      "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

   public EMailValidator() {
      pattern = Pattern.compile(EMAIL_PATTERN);
   }

   public boolean validate(String string) {
      matcher = pattern.matcher(string);
      return matcher.matches();
   }
}
