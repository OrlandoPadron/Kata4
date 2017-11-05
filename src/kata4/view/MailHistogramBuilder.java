package kata4.view;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;

/**
 *
 * @author Orlando Daniel
 */
public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> mail){
        Histogram<String> histo = new Histogram(); 
        
        for (Mail mail1 : mail) {
            histo.increment(mail1.getDomain());
             
        }
        
        return histo; 
    }
}
