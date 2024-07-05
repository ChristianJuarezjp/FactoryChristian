package notificaciones;

public class UrgenteNotificacionFactory implements NotificacionFactory {
    @Override
    public EmailNotificacion crearEmailNotificacion() {
        return new EmailNotificacion();
    }

    @Override
    public SMSNotificacion crearSMSNotificacion() {
        return new SMSNotificacion();
    }

    @Override
    public AppNotificacion crearAppNotificacion() {
        return new AppNotificacion();
    }
}