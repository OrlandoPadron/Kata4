package kata4.main;

import java.io.IOException;
import java.util.List;
import kata4.view.HistogramDisplay;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

/**
 *
 * @author Orlando Daniel
 */
public class Kata4 {

    public static void main(String[] args) throws Exception {
        Kata4 inicializacion = new Kata4();
        inicializacion.execute();
        
    }
    
    //VARIABLES
    private final String filename = "F:/Orlando Daniel/Documentos/NetBeansProjects/Kata4/emails.txt";
    private List<Mail> mailList; 
    private Histogram<String> histogram; 
    private HistogramDisplay histoDisplay; 
    
    private void execute() throws Exception{
        input();
        process();
        output(); 
            
    }

    private void input() throws IOException {
        mailList = MailListReader.read(filename); 
        
    }

    private void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }

    private void output() {
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
    
}
