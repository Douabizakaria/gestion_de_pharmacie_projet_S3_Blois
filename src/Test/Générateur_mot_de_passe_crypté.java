package Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
public class Générateur_mot_de_passe_crypté {
    public class PasswordGenerator {

        public static void main(String[] args) {
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String plainPassword = "nam2020";
            String encodedPassword = passwordEncoder.encode(plainPassword);

            System.out.println(encodedPassword);
        }

    }

}
