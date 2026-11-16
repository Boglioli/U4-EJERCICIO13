public class Main {
    public static void main(String[] args) {
        SistemaMonitoreo sistema = new SistemaMonitoreo();
        AlertaClimatica a1 = new AlertaTormenta();
        AlertaClimatica a2 = new AlertaCalor();
        AlertaClimatica a3 = new AlertaViento();
        sistema.procesarAlerta(a1, 95);
        sistema.procesarAlerta(a2, 55);
        sistema.procesarAlerta(a3, 70);
    }
}
