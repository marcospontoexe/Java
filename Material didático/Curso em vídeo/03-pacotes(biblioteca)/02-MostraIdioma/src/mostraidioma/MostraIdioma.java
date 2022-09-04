package mostraidioma;
import java.util.Locale;

public class MostraIdioma {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("Seu Idioma é " + idioma.getDisplayLanguage().toUpperCase() + "/" + idioma.getDisplayCountry().toUpperCase());
    }
    
}
