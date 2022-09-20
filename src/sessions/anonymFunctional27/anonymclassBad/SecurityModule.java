package sessions.anonymFunctional27.anonymclassBad;

public class SecurityModule implements MonitoringSystem {
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг безопасности стартовал!");
    }
}
