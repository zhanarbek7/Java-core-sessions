package sessions.anonymFunctional27.anonymclassBad;

public class ErrorMonitoringModule implements MonitoringSystem {
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг отслеживания ошибок стартовал!");
    }
}
