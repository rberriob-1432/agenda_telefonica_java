package agendatelefonica.src.main;

import infraestructura.configuraciones.ContainerDependencia;

public final class main {

    private main() {
    }

    public static void main(final String[] args) {

        final ContainerDependencia container =
                new ContainerDependencia();

        container.agendaTelefonicaCli().start();
    }
}