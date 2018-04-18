import guru.springframework.norris.chuck.ChuckNorrisQuotes;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

        JOptionPane.showMessageDialog(null, chuckNorrisQuotes.getRandomQuote());
        
    }
}
