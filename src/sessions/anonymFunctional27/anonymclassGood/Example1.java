package sessions.anonymFunctional27.anonymclassGood;

public class Example1 {

    public static void main(String[] args) {

        MonitoringSystem generalModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг общих показателей стартовал!");
            }
        };

        MonitoringSystem errorModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг отслеживания ошибок стартовал!");
            }
        };

        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг безопасности стартовал!");
            }
        };

        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();
    }
}
