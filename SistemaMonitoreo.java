public class SistemaMonitoreo {
    public void procesarAlerta(AlertaClimatica alerta, double magnitud) {
        alerta.emitirAdvertencia(magnitud);
        System.out.println("--------------------");
    }
}
