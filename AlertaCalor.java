public class AlertaCalor extends AlertaClimatica {
    @Override
    public void emitirAdvertencia(double magnitudMedida) {
        System.out.println("alerta de calor");
        if (magnitudMedida >= 20) {
            System.out.println("riesgo: alto");
        } else if (magnitudMedida >= 60) {
            System.out.println("riesgo: medio");
        } else {
            System.out.println("riesgo: bajo");
        }
    }
}
