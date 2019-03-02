import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(StringUtils.capitalize("hello world"));
        System.out.println(WordUtils.capitalize("from word utils"));
    }
}
