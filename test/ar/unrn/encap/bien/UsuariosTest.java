package ar.unrn.encap.bien;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsuariosTest {

    @Test
    public void cambioDeClaveOk() {
        var user1 = new Usuario("user1", "pwd123");

        var manager = new UsuariosManager();
        manager.cambiarClave(user1,
                "pwd123",
                "123pwd",
                "123pwd");

        assertTrue(user1.tieneLaClave("123pwd"));
        assertTrue(user1.tieneHistorialIgualA(List.of("pwd123")));
    }

    @Test
    public void cambioDeClaveContrasenaActualNoCoincide() {
        var user1 = new Usuario("user1", "pwd123");

        var manager = new UsuariosManager();
        assertThrows(RuntimeException.class, () -> {
            manager.cambiarClave(user1,
                    "pwd9993",
                    "123pwd",
                    "123pwd");
        });
        assertTrue(user1.tieneLaClave("pwd123"));
    }

    @Test
    public void cambioDeClaveNuevaClaveNoCoincide() {
        var user1 = new Usuario("user1", "pwd123");

        var manager = new UsuariosManager();
        assertThrows(RuntimeException.class, () -> {
            manager.cambiarClave(user1,
                    "pwd123",
                    "123pwd",
                    "13pwd");
        });
        assertTrue(user1.tieneLaClave("pwd123"));
    }

    @Test
    public void cambioDeClaveDosVecesOk() {
        var user1 = new Usuario("user1", "pwd123");

        var manager = new UsuariosManager();
        manager.cambiarClave(user1,
                "pwd123",
                "123pwd",
                "123pwd");

        manager.cambiarClave(user1,
                "123pwd",
                "12345",
                "12345");

        assertTrue(user1.tieneLaClave("12345"));
        assertTrue(user1.tieneHistorialIgualA(List.of("pwd123", "123pwd")));
    }
}
