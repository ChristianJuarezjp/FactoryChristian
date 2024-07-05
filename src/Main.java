import notificaciones.*;

public class Main {
    public static void main(String[] args) {

        NotificacionFactory urgenteFactory = new UrgenteNotificacionFactory();
        EmailNotificacion emailUrgente = urgenteFactory.crearEmailNotificacion();
        emailUrgente.enviarMensaje("¡Alerta, es un email urgente!");
        SMSNotificacion smsUrgente = urgenteFactory.crearSMSNotificacion();
        smsUrgente.enviarMensaje("¡Alerta, es un SMS urgente!");
        AppNotificacion appUrgente = urgenteFactory.crearAppNotificacion();
        appUrgente.enviarMensaje("¡Alerta, es un mensaje urgente en la aplicación!");

        System.out.println();

        NotificacionFactory regularFactory = new RegularNotificacionFactory();
        EmailNotificacion emailRegular = regularFactory.crearEmailNotificacion();
        emailRegular.enviarMensaje("¡Este es un email regular.");
        SMSNotificacion smsRegular = regularFactory.crearSMSNotificacion();
        smsRegular.enviarMensaje("¡Este es un SMS regular.");
        AppNotificacion appRegular = regularFactory.crearAppNotificacion();
        appRegular.enviarMensaje("¡Este es un mensaje regular en la aplicación.");
    }
}
