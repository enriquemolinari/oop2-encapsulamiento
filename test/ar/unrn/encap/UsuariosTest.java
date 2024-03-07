package ar.unrn.encap;

import ar.unrn.encap.bien.Usuario;
import ar.unrn.encap.bien.UsuariosManager;
import org.junit.jupiter.api.Test;

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
}
