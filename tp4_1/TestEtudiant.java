
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEtudiant {

    @Test
    void testCalculMoyenne() {

        Etudiant etudiant = new Etudiant("Test", "Student", 20);
        
        String input = "8\n7\n9\n8\n9\n";  // Simulate user input
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        etudiant.RemplirNotes();
        double moyenne = etudiant.CalculMoyenne();

        assertEquals((8+7+9+8+9)/5f, moyenne); 
    }

    @Test
    void testCompareTo() {
   
        Etudiant etudiant1 = new Etudiant("rouissa", "aymen", 22);
        Etudiant etudiant2 = new Etudiant("rabah", "s", 19);

        int result = etudiant1.compareTo(etudiant2);

        assertEquals(1, result);
    }

    @Test
    void testToString() {

        Etudiant etudiant = new Etudiant("rouissa", "aymen", 22);
        String input = "1\n1\n0\n3\n0\n";  // Simulate user input
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        etudiant.RemplirNotes();
        String result = etudiant.toString();
        assertEquals("nom : rouissa\nprenom :aymen\nage :22\nnote :[1.0, 1.0, 0.0, 3.0, 0.0]\nLa moyenne est :1.0", result);
    }
}

