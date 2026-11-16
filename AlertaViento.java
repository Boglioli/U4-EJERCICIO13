public class AlertaViento extends AlertaClimatica {
    @Override
    public void emitirAdvertencia(double magnitudMedida) {
        System.out.println("alerta de tormenta");
        if (magnitudMedida >= 80) {
            System.out.println("riesgo: alto");
        } else if (magnitudMedida >= 50) {
            System.out.println("riesgo: medio");
        } else {
            System.out.println("riesgo: bajo");
        }
    }
}
