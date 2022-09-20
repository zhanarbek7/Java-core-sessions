package sessions.anonymFunctional27.anonymclassBad;

public class Main {
    public static void main(String[] args) {
        GeneralIndicatorsMonitoringModule generalModule = new GeneralIndicatorsMonitoringModule();
        ErrorMonitoringModule errorModule = new ErrorMonitoringModule();
        SecurityModule securityModule = new SecurityModule();

        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();
    }
}
